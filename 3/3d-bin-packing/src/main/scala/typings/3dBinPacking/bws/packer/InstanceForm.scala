package typings.`3dBinPacking`.bws.packer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * <p> A repeated Instance. </p>
  *
  * <p> InstanceForm is an utility class for repeated {@link Instance}. It is designed for shrinking
  * volume of network message I/O by storing {@link count repeated count}. </p>
  *
  * @author Jeongho Nam <http://samchon.org>
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.Entity * / any */ @JSGlobal("bws.packer.InstanceForm")
@js.native
/**
  * Default Constructor.
  */
class InstanceForm () extends js.Object {
  def this(instance: Instance) = this()
  def this(instance: Instance, count: Double) = this()
  @JSName("$count")
  var $count: String = js.native
  @JSName("$height")
  var $height: String = js.native
  @JSName("$length")
  var $length: String = js.native
  @JSName("$name")
  var $name: String = js.native
  @JSName("$width")
  var $width: String = js.native
  /**
    * Repeated count of the {@link instance}.
    */
  var count: js.Any = js.native
  /**
    * A duplicated Instance.
    */
  var instance: js.Any = js.native
  /**
    * @inheritdoc
    */
  def TAG(): String = js.native
  /**
    * @inheritdoc
    */
  def construct(
    xml: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any
  ): Unit = js.native
  /* private */ def createInstance(xml: js.Any): js.Any = js.native
  def getCount(): Double = js.native
  def getInstance(): Instance = js.native
  def key(): js.Any = js.native
  def setCount(`val`: Double): Unit = js.native
  /**
    * <p> Repeated {@link instance} to {@link InstanceArray}.
    *
    * @details
    * <p> Contains the {@link instance repeated instance} to an {@link InstanceArray} to make
    * {@link instance} to participate in the packing process. The returned {@link InstanceArray} will be
    * registered on {@link Packer.instanceArray}.
    *
    * @return An array of instance containing repeated {@link instance}.
    */
  def toInstanceArray(): InstanceArray = js.native
  /**
    * @inheritdoc
    */
  def toXML(): js.Any = js.native
}

