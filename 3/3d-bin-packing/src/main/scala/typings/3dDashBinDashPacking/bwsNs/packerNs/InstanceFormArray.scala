package typings.`3dDashBinDashPacking`.bwsNs.packerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An array of {@link InstanceForm} objects.
  *
  * @author Jeongho Nam <http://samchon.org>
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @JSGlobal("bws.packer.InstanceFormArray")
@js.native
/**
  * Default Constructor.
  */
class InstanceFormArray () extends js.Object {
  def CHILD_TAG(): String = js.native
  def TAG(): String = js.native
  def createChild(
    xml: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify library.XML */ js.Any
  ): InstanceForm = js.native
  /**
    * Convert {@link InstanceForm} objects to {@link InstanceArray}.
    *
    * @return An array of instance containing repeated instances in {@link InstanceForm} objects.
    */
  def toInstanceArray(): InstanceArray = js.native
}

