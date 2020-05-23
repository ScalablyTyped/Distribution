package typings.`3dBinPacking`.bws.packer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GAWrapperArray extends WrapperArray {
  var instanceArray: InstanceArray
  var price: js.Any
  var result: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.HashMap<string, WrapperGroup> */ js.Any
  /**
    * @brief Validity of this sequence list.
    */
  var valid: js.Any
  /* private */ def constructResult(): js.Any
  /**
    * @brief Get optimization result.
    *
    * @return result map.
    */
  def getResult(): js.Any
  def less(obj: GAWrapperArray): Boolean
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
}

