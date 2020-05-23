package typings.`3dBinPacking`.bws.packer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Bridge of {@link Packer} for {@link InstanceForm repeated instances}.
  *
  * @author Jeongho Nam <http://samchon.org>
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.Entity * / any */ trait PackerForm extends js.Object {
  /**
    * Form of Instances to pack.
    */
  var instanceFormArray: js.Any
  /**
    * Type of Wrappers to be used.
    */
  var wrapperArray: js.Any
  def TAG(): String
  def construct(
    xml: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any
  ): Unit
  def getInstanceFormArray(): InstanceFormArray
  def getWrapperArray(): WrapperArray
  def optimize(): WrapperArray
  def toPacker(): Packer
  def toXML(): js.Any
}

object PackerForm {
  @scala.inline
  def apply(
    TAG: () => String,
    construct: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any => Unit,
    getInstanceFormArray: () => InstanceFormArray,
    getWrapperArray: () => WrapperArray,
    instanceFormArray: js.Any,
    optimize: () => WrapperArray,
    toPacker: () => Packer,
    toXML: () => js.Any,
    wrapperArray: js.Any
  ): PackerForm = {
    val __obj = js.Dynamic.literal(TAG = js.Any.fromFunction0(TAG), construct = js.Any.fromFunction1(construct), getInstanceFormArray = js.Any.fromFunction0(getInstanceFormArray), getWrapperArray = js.Any.fromFunction0(getWrapperArray), instanceFormArray = instanceFormArray.asInstanceOf[js.Any], optimize = js.Any.fromFunction0(optimize), toPacker = js.Any.fromFunction0(toPacker), toXML = js.Any.fromFunction0(toXML), wrapperArray = wrapperArray.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackerForm]
  }
}

