package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddIn extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Autoload: Boolean = js.native
  
  val Compiled: Boolean = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  val Index: Double = js.native
  
  var Installed: Boolean = js.native
  
  val Name: String = js.native
  
  val Parent: js.Any = js.native
  
  val Path: String = js.native
  
  @JSName("Word.AddIn_typekey")
  var WordDotAddIn_typekey: AddIn = js.native
}
object AddIn {
  
  @scala.inline
  def apply(
    Application: Application,
    Autoload: Boolean,
    Compiled: Boolean,
    Creator: Double,
    Delete: () => Unit,
    Index: Double,
    Installed: Boolean,
    Name: String,
    Parent: js.Any,
    Path: String,
    WordDotAddIn_typekey: AddIn
  ): AddIn = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Autoload = Autoload.asInstanceOf[js.Any], Compiled = Compiled.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Index = Index.asInstanceOf[js.Any], Installed = Installed.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.AddIn_typekey")(WordDotAddIn_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddIn]
  }
  
  @scala.inline
  implicit class AddInMutableBuilder[Self <: AddIn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoload(value: Boolean): Self = StObject.set(x, "Autoload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompiled(value: Boolean): Self = StObject.set(x, "Compiled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstalled(value: Boolean): Self = StObject.set(x, "Installed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotAddIn_typekey(value: AddIn): Self = StObject.set(x, "Word.AddIn_typekey", value.asInstanceOf[js.Any])
  }
}
