package typings.`3dBinPacking`.bws.packer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("bws.packer.GAWrapperArray")
@js.native
class GAWrapperArray protected () extends WrapperArray {
  /**
    * @brief Copy Constructor.
    */
  def this(genes: GAWrapperArray) = this()
  /**
    * Construct from instances.
    *
    * @param instanceArray Instances to be wrapped.
    */
  def this(instanceArray: InstanceArray) = this()
  var instanceArray: InstanceArray = js.native
  var price: js.Any = js.native
  var result: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.HashMap<string, WrapperGroup> */ js.Any = js.native
  /**
    * @brief Validity of this sequence list.
    */
  var valid: js.Any = js.native
  /* private */ def constructResult(): js.Any = js.native
  /**
    * @brief Get optimization result.
    *
    * @return result map.
    */
  def getResult(): js.Any = js.native
  def less(obj: GAWrapperArray): Boolean = js.native
}

