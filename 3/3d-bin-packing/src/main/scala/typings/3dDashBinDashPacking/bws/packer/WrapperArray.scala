package typings.`3dDashBinDashPacking`.bws.packer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify protocol.EntityArrayCollection<Wrapper> * / any */ @JSGlobal("bws.packer.WrapperArray")
@js.native
/**
  * Default Constructor.
  */
class WrapperArray () extends js.Object {
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
    xml: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify library.XML */ js.Any
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

