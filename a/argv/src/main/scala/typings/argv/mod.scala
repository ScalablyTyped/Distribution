package typings.argv

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("argv", JSImport.Namespace)
  @js.native
  val ^ : typings.argv.mod.argv = js.native
  
  type _To = typings.argv.mod.argv
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: typings.argv.mod.argv = ^
  
  trait args extends StObject {
    
    var options: StringDictionary[js.Any]
    
    var targets: js.Array[String]
  }
  object args {
    
    @scala.inline
    def apply(options: StringDictionary[js.Any], targets: js.Array[String]): args = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
      __obj.asInstanceOf[args]
    }
    
    @scala.inline
    implicit class argsMutableBuilder[Self <: args] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: StringDictionary[js.Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargets(value: js.Array[String]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetsVarargs(value: String*): Self = StObject.set(x, "targets", js.Array(value :_*))
    }
  }
  
  @js.native
  trait argv extends StObject {
    
    // Cleans out current options
    def clear(): typings.argv.mod.argv = js.native
    
    // Prints out the help doc
    def help(): typings.argv.mod.argv = js.native
    def help(mod: String): typings.argv.mod.argv = js.native
    
    // Description setup
    def info(mod: String): typings.argv.mod.argv = js.native
    def info(mod: String, description: module): typings.argv.mod.argv = js.native
    
    def mod(`object`: js.Array[module]): typings.argv.mod.argv = js.native
    // Creating module
    def mod(`object`: module): typings.argv.mod.argv = js.native
    
    def option(mod: js.Array[helpOption]): typings.argv.mod.argv = js.native
    // Adding options to definitions list
    def option(mod: helpOption): typings.argv.mod.argv = js.native
    
    // Runs the arguments parser
    def run(): args = js.native
    def run(argv: js.Array[String]): args = js.native
    
    // Creates custom type function
    def `type`(name: String): js.Any = js.native
    def `type`(name: String, callback: typeFunction): js.Any = js.native
    def `type`(name: StringDictionary[typeFunction]): js.Any = js.native
    def `type`(name: StringDictionary[typeFunction], callback: typeFunction): js.Any = js.native
    
    // Setting version number, and auto setting version option
    def version(v: String): typings.argv.mod.argv = js.native
  }
  
  trait helpOption extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
    
    var example: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var short: js.UndefOr[String] = js.undefined
    
    var `type`: String
  }
  object helpOption {
    
    @scala.inline
    def apply(name: String, `type`: String): helpOption = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[helpOption]
    }
    
    @scala.inline
    implicit class helpOptionMutableBuilder[Self <: helpOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setExample(value: String): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExampleUndefined: Self = StObject.set(x, "example", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortUndefined: Self = StObject.set(x, "short", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait module extends StObject {
    
    var description: String
    
    var mod: String
    
    var options: StringDictionary[helpOption]
  }
  object module {
    
    @scala.inline
    def apply(description: String, mod: String, options: StringDictionary[helpOption]): module = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], mod = mod.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[module]
    }
    
    @scala.inline
    implicit class moduleMutableBuilder[Self <: module] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMod(value: String): Self = StObject.set(x, "mod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: StringDictionary[helpOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait typeFunction extends StObject {
    
    def apply(value: js.Any, arglist: js.Any*): js.Any = js.native
  }
}
