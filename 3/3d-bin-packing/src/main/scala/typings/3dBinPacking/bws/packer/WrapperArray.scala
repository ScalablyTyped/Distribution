package typings.`3dBinPacking`.bws.packer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.EntityArrayCollection<Wrapper> * / any */ @js.native
trait WrapperArray extends js.Object {
  /**
    * @inheritdoc
    */
  def CHILD_TAG(): String = js.native
  /**
    * @inheritdoc
    */
  def TAG(): String = js.native
  /**
    * @inheritdoc
    */
  def createChild(
    xml: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any
  ): Wrapper = js.native
  /**
    * Get (calculate) price.
    */
  def getPrice(): Double = js.native
  /**
    * Get (calculate) utilization rate.
    */
  def getUtilization(): Double = js.native
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
  @scala.inline
  implicit class WrapperArrayOps[Self <: WrapperArray] (val x: Self) extends AnyVal {
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
    def setCHILD_TAG(value: () => String): Self = this.set("CHILD_TAG", js.Any.fromFunction0(value))
    @scala.inline
    def setTAG(value: () => String): Self = this.set("TAG", js.Any.fromFunction0(value))
    @scala.inline
    def setCreateChild(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any => Wrapper
    ): Self = this.set("createChild", js.Any.fromFunction1(value))
    @scala.inline
    def setGetPrice(value: () => Double): Self = this.set("getPrice", js.Any.fromFunction0(value))
    @scala.inline
    def setGetUtilization(value: () => Double): Self = this.set("getUtilization", js.Any.fromFunction0(value))
  }
  
}

