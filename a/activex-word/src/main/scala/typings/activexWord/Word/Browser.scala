package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Browser extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  def Next(): Unit
  
  val Parent: Any
  
  def Previous(): Unit
  
  var Target: WdBrowseTarget
  
  /* private */ @JSName("Word.Browser_typekey")
  var WordDotBrowser_typekey: Browser
}
object Browser {
  
  inline def apply(
    Application: Application,
    Creator: Double,
    Next: () => Unit,
    Parent: Any,
    Previous: () => Unit,
    Target: WdBrowseTarget,
    WordDotBrowser_typekey: Browser
  ): Browser = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Next = js.Any.fromFunction0(Next), Parent = Parent.asInstanceOf[js.Any], Previous = js.Any.fromFunction0(Previous), Target = Target.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Browser_typekey")(WordDotBrowser_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Browser]
  }
  
  extension [Self <: Browser](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setNext(value: () => Unit): Self = StObject.set(x, "Next", js.Any.fromFunction0(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPrevious(value: () => Unit): Self = StObject.set(x, "Previous", js.Any.fromFunction0(value))
    
    inline def setTarget(value: WdBrowseTarget): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
    
    inline def setWordDotBrowser_typekey(value: Browser): Self = StObject.set(x, "Word.Browser_typekey", value.asInstanceOf[js.Any])
  }
}
