package typings.`3dBinPacking`.bws.packer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An array of {@link InstanceForm} objects.
  *
  * @author Jeongho Nam <http://samchon.org>
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.EntityArrayCollection<InstanceForm> * / any */ trait InstanceFormArray extends js.Object {
  def CHILD_TAG(): String
  def TAG(): String
  def createChild(
    xml: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any
  ): InstanceForm
  /**
    * Convert {@link InstanceForm} objects to {@link InstanceArray}.
    *
    * @return An array of instance containing repeated instances in {@link InstanceForm} objects.
    */
  def toInstanceArray(): InstanceArray
}

object InstanceFormArray {
  @scala.inline
  def apply(
    CHILD_TAG: () => String,
    TAG: () => String,
    createChild: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any => InstanceForm,
    toInstanceArray: () => InstanceArray
  ): InstanceFormArray = {
    val __obj = js.Dynamic.literal(CHILD_TAG = js.Any.fromFunction0(CHILD_TAG), TAG = js.Any.fromFunction0(TAG), createChild = js.Any.fromFunction1(createChild), toInstanceArray = js.Any.fromFunction0(toInstanceArray))
    __obj.asInstanceOf[InstanceFormArray]
  }
}

