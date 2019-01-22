package typings
package `3dDashBinDashPackingLib`.bwsNs.packerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An array of Instance objects.
  *
  * @author Jeongho Nam <http://samchon.org>
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @JSGlobal("bws.packer.InstanceArray")
@js.native
/**
  * Default Constructor.
  */
class InstanceArray () extends js.Object {
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
  ): Instance = js.native
}

