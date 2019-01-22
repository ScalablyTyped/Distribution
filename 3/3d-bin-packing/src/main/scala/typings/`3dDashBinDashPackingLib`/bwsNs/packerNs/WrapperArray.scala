package typings
package `3dDashBinDashPackingLib`.bwsNs.packerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @JSGlobal("bws.packer.WrapperArray")
@js.native
/**
  * Default Constructor.
  */
class WrapperArray () extends js.Object {
  /**
    * @inheritdoc
    */
  def CHILD_TAG(): java.lang.String = js.native
  /**
    * @inheritdoc
    */
  def TAG(): java.lang.String = js.native
  /**
    * @inheritdoc
    */
  def createChild(
    xml: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify library.XML */ js.Any
  ): Wrapper = js.native
  /**
    * Get (calculate) price.
    */
  def getPrice(): scala.Double = js.native
  /**
    * Get (calculate) utilization rate.
    */
  def getUtilization(): scala.Double = js.native
}

