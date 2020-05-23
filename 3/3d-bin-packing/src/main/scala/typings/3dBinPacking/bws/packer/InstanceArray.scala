package typings.`3dBinPacking`.bws.packer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An array of Instance objects.
  *
  * @author Jeongho Nam <http://samchon.org>
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.EntityArray<Instance> * / any */ trait InstanceArray extends js.Object {
  /**
    * @inheritdoc
    */
  def CHILD_TAG(): String
  /**
    * @inheritdoc
    */
  def TAG(): String
  /**
    * @inheritdoc
    */
  def createChild(
    xml: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any
  ): Instance
}

object InstanceArray {
  @scala.inline
  def apply(
    CHILD_TAG: () => String,
    TAG: () => String,
    createChild: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any => Instance
  ): InstanceArray = {
    val __obj = js.Dynamic.literal(CHILD_TAG = js.Any.fromFunction0(CHILD_TAG), TAG = js.Any.fromFunction0(TAG), createChild = js.Any.fromFunction1(createChild))
    __obj.asInstanceOf[InstanceArray]
  }
}

