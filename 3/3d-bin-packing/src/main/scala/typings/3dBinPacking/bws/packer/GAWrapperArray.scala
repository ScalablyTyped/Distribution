package typings.`3dBinPacking`.bws.packer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GAWrapperArray extends WrapperArray {
  
  /* private */ def constructResult(): js.Any = js.native
  
  /**
    * @brief Get optimization result.
    *
    * @return result map.
    */
  def getResult(): js.Any = js.native
  
  var instanceArray: InstanceArray = js.native
  
  def less(obj: GAWrapperArray): Boolean = js.native
  
  var price: js.Any = js.native
  
  var result: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.HashMap<string, WrapperGroup> */ js.Any = js.native
  
  /**
    * @brief Validity of this sequence list.
    */
  var valid: js.Any = js.native
}
object GAWrapperArray {
  
  @scala.inline
  def apply(
    CHILD_TAG: () => String,
    TAG: () => String,
    constructResult: () => js.Any,
    createChild: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any => Wrapper,
    getPrice: () => Double,
    getResult: () => js.Any,
    getUtilization: () => Double,
    instanceArray: InstanceArray,
    less: GAWrapperArray => Boolean,
    price: js.Any,
    result: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.HashMap<string, WrapperGroup> */ js.Any,
    valid: js.Any
  ): GAWrapperArray = {
    val __obj = js.Dynamic.literal(CHILD_TAG = js.Any.fromFunction0(CHILD_TAG), TAG = js.Any.fromFunction0(TAG), constructResult = js.Any.fromFunction0(constructResult), createChild = js.Any.fromFunction1(createChild), getPrice = js.Any.fromFunction0(getPrice), getResult = js.Any.fromFunction0(getResult), getUtilization = js.Any.fromFunction0(getUtilization), instanceArray = instanceArray.asInstanceOf[js.Any], less = js.Any.fromFunction1(less), price = price.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[GAWrapperArray]
  }
  
  @scala.inline
  implicit class GAWrapperArrayOps[Self <: GAWrapperArray] (val x: Self) extends AnyVal {
    
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
    def setConstructResult(value: () => js.Any): Self = this.set("constructResult", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetResult(value: () => js.Any): Self = this.set("getResult", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInstanceArray(value: InstanceArray): Self = this.set("instanceArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLess(value: GAWrapperArray => Boolean): Self = this.set("less", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPrice(value: js.Any): Self = this.set("price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.HashMap<string, WrapperGroup> */ js.Any
    ): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValid(value: js.Any): Self = this.set("valid", value.asInstanceOf[js.Any])
  }
}
