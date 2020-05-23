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
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.Entity * / any */ trait InstanceForm extends js.Object {
  @JSName("$count")
  var $count: String
  @JSName("$height")
  var $height: String
  @JSName("$length")
  var $length: String
  @JSName("$name")
  var $name: String
  @JSName("$width")
  var $width: String
  /**
    * Repeated count of the {@link instance}.
    */
  var count: js.Any
  /**
    * A duplicated Instance.
    */
  var instance: js.Any
  /**
    * @inheritdoc
    */
  def TAG(): String
  /**
    * @inheritdoc
    */
  def construct(
    xml: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any
  ): Unit
  /* private */ def createInstance(xml: js.Any): js.Any
  def getCount(): Double
  def getInstance(): Instance
  def key(): js.Any
  def setCount(`val`: Double): Unit
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
  def toInstanceArray(): InstanceArray
  /**
    * @inheritdoc
    */
  def toXML(): js.Any
}

object InstanceForm {
  @scala.inline
  def apply(
    $count: String,
    $height: String,
    $length: String,
    $name: String,
    $width: String,
    TAG: () => String,
    construct: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any => Unit,
    count: js.Any,
    createInstance: js.Any => js.Any,
    getCount: () => Double,
    getInstance: () => Instance,
    instance: js.Any,
    key: () => js.Any,
    setCount: Double => Unit,
    toInstanceArray: () => InstanceArray,
    toXML: () => js.Any
  ): InstanceForm = {
    val __obj = js.Dynamic.literal($count = $count.asInstanceOf[js.Any], $height = $height.asInstanceOf[js.Any], $length = $length.asInstanceOf[js.Any], $name = $name.asInstanceOf[js.Any], $width = $width.asInstanceOf[js.Any], TAG = js.Any.fromFunction0(TAG), construct = js.Any.fromFunction1(construct), count = count.asInstanceOf[js.Any], createInstance = js.Any.fromFunction1(createInstance), getCount = js.Any.fromFunction0(getCount), getInstance = js.Any.fromFunction0(getInstance), instance = instance.asInstanceOf[js.Any], key = js.Any.fromFunction0(key), setCount = js.Any.fromFunction1(setCount), toInstanceArray = js.Any.fromFunction0(toInstanceArray), toXML = js.Any.fromFunction0(toXML))
    __obj.asInstanceOf[InstanceForm]
  }
}

