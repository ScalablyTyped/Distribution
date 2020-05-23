package typings.`3dBinPacking`.bws.packer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.EntityArrayCollection<Wrapper> * / any */ trait WrapperArray extends js.Object {
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
  ): Wrapper
  /**
    * Get (calculate) price.
    */
  def getPrice(): Double
  /**
    * Get (calculate) utilization rate.
    */
  def getUtilization(): Double
}

object WrapperArray {
  @scala.inline
  def apply(
    CHILD_TAG: () => String,
    TAG: () => String,
    createChild: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any => Wrapper,
    getPrice: () => Double,
    getUtilization: () => Double
  ): WrapperArray = {
    val __obj = js.Dynamic.literal(CHILD_TAG = js.Any.fromFunction0(CHILD_TAG), TAG = js.Any.fromFunction0(TAG), createChild = js.Any.fromFunction1(createChild), getPrice = js.Any.fromFunction0(getPrice), getUtilization = js.Any.fromFunction0(getUtilization))
    __obj.asInstanceOf[WrapperArray]
  }
}

