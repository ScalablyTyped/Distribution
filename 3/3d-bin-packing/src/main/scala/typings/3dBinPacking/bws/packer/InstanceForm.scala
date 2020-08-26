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
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.Entity * / any */ @js.native
trait InstanceForm extends js.Object {
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
  @scala.inline
  implicit class InstanceFormOps[Self <: InstanceForm] (val x: Self) extends AnyVal {
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
    def set$count(value: String): Self = this.set("$count", value.asInstanceOf[js.Any])
    @scala.inline
    def set$height(value: String): Self = this.set("$height", value.asInstanceOf[js.Any])
    @scala.inline
    def set$length(value: String): Self = this.set("$length", value.asInstanceOf[js.Any])
    @scala.inline
    def set$name(value: String): Self = this.set("$name", value.asInstanceOf[js.Any])
    @scala.inline
    def set$width(value: String): Self = this.set("$width", value.asInstanceOf[js.Any])
    @scala.inline
    def setTAG(value: () => String): Self = this.set("TAG", js.Any.fromFunction0(value))
    @scala.inline
    def setConstruct(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any => Unit
    ): Self = this.set("construct", js.Any.fromFunction1(value))
    @scala.inline
    def setCount(value: js.Any): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateInstance(value: js.Any => js.Any): Self = this.set("createInstance", js.Any.fromFunction1(value))
    @scala.inline
    def setGetCount(value: () => Double): Self = this.set("getCount", js.Any.fromFunction0(value))
    @scala.inline
    def setGetInstance(value: () => Instance): Self = this.set("getInstance", js.Any.fromFunction0(value))
    @scala.inline
    def setInstance(value: js.Any): Self = this.set("instance", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: () => js.Any): Self = this.set("key", js.Any.fromFunction0(value))
    @scala.inline
    def setSetCount(value: Double => Unit): Self = this.set("setCount", js.Any.fromFunction1(value))
    @scala.inline
    def setToInstanceArray(value: () => InstanceArray): Self = this.set("toInstanceArray", js.Any.fromFunction0(value))
    @scala.inline
    def setToXML(value: () => js.Any): Self = this.set("toXML", js.Any.fromFunction0(value))
  }
  
}

