package typings.awsLambda.dynamodbStreamMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttributeValue extends js.Object {
  
  var B: js.UndefOr[String] = js.native
  
  var BOOL: js.UndefOr[Boolean] = js.native
  
  var BS: js.UndefOr[js.Array[String]] = js.native
  
  var L: js.UndefOr[js.Array[AttributeValue]] = js.native
  
  var M: js.UndefOr[StringDictionary[AttributeValue]] = js.native
  
  var N: js.UndefOr[String] = js.native
  
  var NS: js.UndefOr[js.Array[String]] = js.native
  
  var NULL: js.UndefOr[Boolean] = js.native
  
  var S: js.UndefOr[String] = js.native
  
  var SS: js.UndefOr[js.Array[String]] = js.native
}
object AttributeValue {
  
  @scala.inline
  def apply(): AttributeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeValue]
  }
  
  @scala.inline
  implicit class AttributeValueOps[Self <: AttributeValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setB(value: String): Self = this.set("B", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteB: Self = this.set("B", js.undefined)
    
    @scala.inline
    def setBOOL(value: Boolean): Self = this.set("BOOL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBOOL: Self = this.set("BOOL", js.undefined)
    
    @scala.inline
    def setBSVarargs(value: String*): Self = this.set("BS", js.Array(value :_*))
    
    @scala.inline
    def setBS(value: js.Array[String]): Self = this.set("BS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBS: Self = this.set("BS", js.undefined)
    
    @scala.inline
    def setLVarargs(value: AttributeValue*): Self = this.set("L", js.Array(value :_*))
    
    @scala.inline
    def setL(value: js.Array[AttributeValue]): Self = this.set("L", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteL: Self = this.set("L", js.undefined)
    
    @scala.inline
    def setM(value: StringDictionary[AttributeValue]): Self = this.set("M", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteM: Self = this.set("M", js.undefined)
    
    @scala.inline
    def setN(value: String): Self = this.set("N", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteN: Self = this.set("N", js.undefined)
    
    @scala.inline
    def setNSVarargs(value: String*): Self = this.set("NS", js.Array(value :_*))
    
    @scala.inline
    def setNS(value: js.Array[String]): Self = this.set("NS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNS: Self = this.set("NS", js.undefined)
    
    @scala.inline
    def setNULL(value: Boolean): Self = this.set("NULL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNULL: Self = this.set("NULL", js.undefined)
    
    @scala.inline
    def setS(value: String): Self = this.set("S", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS: Self = this.set("S", js.undefined)
    
    @scala.inline
    def setSSVarargs(value: String*): Self = this.set("SS", js.Array(value :_*))
    
    @scala.inline
    def setSS(value: js.Array[String]): Self = this.set("SS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSS: Self = this.set("SS", js.undefined)
  }
}
