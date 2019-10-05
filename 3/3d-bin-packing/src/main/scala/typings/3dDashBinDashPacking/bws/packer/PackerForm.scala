package typings.`3dDashBinDashPacking`.bws.packer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Bridge of {@link Packer} for {@link InstanceForm repeated instances}.
  *
  * @author Jeongho Nam <http://samchon.org>
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify protocol.Entity * / any */ @JSGlobal("bws.packer.PackerForm")
@js.native
/**
  * Default Constructor.
  */
class PackerForm () extends js.Object {
  /**
    * Initializer Constructor.
    *
    * @param instanceFormArray Form of Instances to pack.
    * @param wrapperArray Type of Wrappers to be used.
    */
  def this(instanceFormArray: InstanceFormArray, wrapperArray: WrapperArray) = this()
  /**
    * Form of Instances to pack.
    */
  var instanceFormArray: js.Any = js.native
  /**
    * Type of Wrappers to be used.
    */
  var wrapperArray: js.Any = js.native
  def TAG(): String = js.native
  def construct(
    xml: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify library.XML */ js.Any
  ): Unit = js.native
  def getInstanceFormArray(): InstanceFormArray = js.native
  def getWrapperArray(): WrapperArray = js.native
  def optimize(): WrapperArray = js.native
  def toPacker(): Packer = js.native
  def toXML(): js.Any = js.native
}

