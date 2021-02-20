package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BYNCNY extends StObject {
  
  var BYN: js.Array[js.UndefOr[String]] = js.native
  
  var CNY: js.Array[String] = js.native
  
  var ILP: js.Array[String] = js.native
  
  var THB: js.Array[String] = js.native
  
  var TWD: js.Array[String] = js.native
}
object BYNCNY {
  
  @scala.inline
  def apply(
    BYN: js.Array[js.UndefOr[String]],
    CNY: js.Array[String],
    ILP: js.Array[String],
    THB: js.Array[String],
    TWD: js.Array[String]
  ): BYNCNY = {
    val __obj = js.Dynamic.literal(BYN = BYN.asInstanceOf[js.Any], CNY = CNY.asInstanceOf[js.Any], ILP = ILP.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
    __obj.asInstanceOf[BYNCNY]
  }
  
  @scala.inline
  implicit class BYNCNYMutableBuilder[Self <: BYNCNY] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBYN(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "BYN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBYNVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "BYN", js.Array(value :_*))
    
    @scala.inline
    def setCNY(value: js.Array[String]): Self = StObject.set(x, "CNY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCNYVarargs(value: String*): Self = StObject.set(x, "CNY", js.Array(value :_*))
    
    @scala.inline
    def setILP(value: js.Array[String]): Self = StObject.set(x, "ILP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setILPVarargs(value: String*): Self = StObject.set(x, "ILP", js.Array(value :_*))
    
    @scala.inline
    def setTHB(value: js.Array[String]): Self = StObject.set(x, "THB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTHBVarargs(value: String*): Self = StObject.set(x, "THB", js.Array(value :_*))
    
    @scala.inline
    def setTWD(value: js.Array[String]): Self = StObject.set(x, "TWD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTWDVarargs(value: String*): Self = StObject.set(x, "TWD", js.Array(value :_*))
  }
}
