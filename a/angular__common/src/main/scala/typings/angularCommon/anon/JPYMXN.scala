package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JPYMXN extends StObject {
  
  var CAD: js.Array[js.UndefOr[String]] = js.native
  
  var JPY: js.Array[String] = js.native
  
  var MXN: js.Array[js.UndefOr[String]] = js.native
  
  var MYR: js.Array[String] = js.native
  
  var SGD: js.Array[String] = js.native
  
  var TWD: js.Array[String] = js.native
  
  var USD: js.Array[js.UndefOr[String]] = js.native
}
object JPYMXN {
  
  @scala.inline
  def apply(
    CAD: js.Array[js.UndefOr[String]],
    JPY: js.Array[String],
    MXN: js.Array[js.UndefOr[String]],
    MYR: js.Array[String],
    SGD: js.Array[String],
    TWD: js.Array[String],
    USD: js.Array[js.UndefOr[String]]
  ): JPYMXN = {
    val __obj = js.Dynamic.literal(CAD = CAD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], MXN = MXN.asInstanceOf[js.Any], MYR = MYR.asInstanceOf[js.Any], SGD = SGD.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[JPYMXN]
  }
  
  @scala.inline
  implicit class JPYMXNMutableBuilder[Self <: JPYMXN] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCAD(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "CAD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCADVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "CAD", js.Array(value :_*))
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setMXN(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "MXN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMXNVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "MXN", js.Array(value :_*))
    
    @scala.inline
    def setMYR(value: js.Array[String]): Self = StObject.set(x, "MYR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMYRVarargs(value: String*): Self = StObject.set(x, "MYR", js.Array(value :_*))
    
    @scala.inline
    def setSGD(value: js.Array[String]): Self = StObject.set(x, "SGD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSGDVarargs(value: String*): Self = StObject.set(x, "SGD", js.Array(value :_*))
    
    @scala.inline
    def setTWD(value: js.Array[String]): Self = StObject.set(x, "TWD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTWDVarargs(value: String*): Self = StObject.set(x, "TWD", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
