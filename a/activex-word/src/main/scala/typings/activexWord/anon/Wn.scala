package typings.activexWord.anon

import typings.activexWord.Word.Document
import typings.activexWord.Word.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Wn extends StObject {
  
  val Doc: Document
  
  val Wn: Window
}
object Wn {
  
  @scala.inline
  def apply(Doc: Document, Wn: Window): Wn = {
    val __obj = js.Dynamic.literal(Doc = Doc.asInstanceOf[js.Any], Wn = Wn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Wn]
  }
  
  @scala.inline
  implicit class WnMutableBuilder[Self <: Wn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDoc(value: Document): Self = StObject.set(x, "Doc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWn(value: Window): Self = StObject.set(x, "Wn", value.asInstanceOf[js.Any])
  }
}
