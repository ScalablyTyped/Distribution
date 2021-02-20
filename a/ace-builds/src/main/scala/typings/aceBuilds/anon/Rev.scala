package typings.aceBuilds.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rev extends StObject {
  
  var rev: Double = js.native
  
  var value: String = js.native
}
object Rev {
  
  @scala.inline
  def apply(rev: Double, value: String): Rev = {
    val __obj = js.Dynamic.literal(rev = rev.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rev]
  }
  
  @scala.inline
  implicit class RevMutableBuilder[Self <: Rev] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRev(value: Double): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
