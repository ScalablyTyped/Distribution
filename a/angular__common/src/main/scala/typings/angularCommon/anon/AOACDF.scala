package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AOACDF extends StObject {
  
  var AOA: js.Array[String] = js.native
  
  var CDF: js.Array[String] = js.native
  
  var JPY: js.Array[String] = js.native
  
  var USD: js.Array[String] = js.native
}
object AOACDF {
  
  @scala.inline
  def apply(AOA: js.Array[String], CDF: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): AOACDF = {
    val __obj = js.Dynamic.literal(AOA = AOA.asInstanceOf[js.Any], CDF = CDF.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AOACDF]
  }
  
  @scala.inline
  implicit class AOACDFMutableBuilder[Self <: AOACDF] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAOA(value: js.Array[String]): Self = StObject.set(x, "AOA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAOAVarargs(value: String*): Self = StObject.set(x, "AOA", js.Array(value :_*))
    
    @scala.inline
    def setCDF(value: js.Array[String]): Self = StObject.set(x, "CDF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCDFVarargs(value: String*): Self = StObject.set(x, "CDF", js.Array(value :_*))
    
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
