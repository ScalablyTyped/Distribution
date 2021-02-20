package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FJD extends StObject {
  
  var FJD: js.Array[String] = js.native
  
  var JPY: js.Array[String] = js.native
  
  var USD: js.Array[String] = js.native
}
object FJD {
  
  @scala.inline
  def apply(FJD: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): FJD = {
    val __obj = js.Dynamic.literal(FJD = FJD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[FJD]
  }
  
  @scala.inline
  implicit class FJDMutableBuilder[Self <: FJD] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFJD(value: js.Array[String]): Self = StObject.set(x, "FJD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFJDVarargs(value: String*): Self = StObject.set(x, "FJD", js.Array(value :_*))
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
