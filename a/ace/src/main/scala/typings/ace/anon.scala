package typings.ace

import typings.ace.AceAjax.Editor
import typings.ace.AceAjax.EditorCommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Args extends StObject {
    
    var args: js.Array[Any]
    
    var command: EditorCommand
    
    var editor: Editor
  }
  object Args {
    
    inline def apply(args: js.Array[Any], command: EditorCommand, editor: Editor): Args = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any])
      __obj.asInstanceOf[Args]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Args] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setCommand(value: EditorCommand): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setEditor(value: Editor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    }
  }
  
  trait Command extends StObject {
    
    var command: String
  }
  object Command {
    
    inline def apply(command: String): Command = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
      __obj.asInstanceOf[Command]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Command] (val x: Self) extends AnyVal {
      
      inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    }
  }
  
  trait HashId extends StObject {
    
    var hashId: Double
    
    var key: String
  }
  object HashId {
    
    inline def apply(hashId: Double, key: String): HashId = {
      val __obj = js.Dynamic.literal(hashId = hashId.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[HashId]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HashId] (val x: Self) extends AnyVal {
      
      inline def setHashId(value: Double): Self = StObject.set(x, "hashId", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait Mac extends StObject {
    
    var mac: js.UndefOr[String] = js.undefined
    
    var win: js.UndefOr[String] = js.undefined
  }
  object Mac {
    
    inline def apply(): Mac = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Mac]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Mac] (val x: Self) extends AnyVal {
      
      inline def setMac(value: String): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
      
      inline def setMacUndefined: Self = StObject.set(x, "mac", js.undefined)
      
      inline def setWin(value: String): Self = StObject.set(x, "win", value.asInstanceOf[js.Any])
      
      inline def setWinUndefined: Self = StObject.set(x, "win", js.undefined)
    }
  }
}
