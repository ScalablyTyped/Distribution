package typings.angularCore.anon

import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameTarget extends StObject {
  
  var name: String
  
  var target: Document
}
object NameTarget {
  
  @scala.inline
  def apply(name: String, target: Document): NameTarget = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameTarget]
  }
  
  @scala.inline
  implicit class NameTargetMutableBuilder[Self <: NameTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Document): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
