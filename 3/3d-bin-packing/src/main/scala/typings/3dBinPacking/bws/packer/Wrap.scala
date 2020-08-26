package typings.`3dBinPacking`.bws.packer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * <p> Wrap represents an act wrap(ping). </p>
  *
  * <p> {@link Wrap} is a class represents an act wrapping an {@link Instance} to an {@link Wrapper}.
  * To represent the relationship, Wrap uses Bridge and Capsular patterns to links and intermediates
  * relationship between Wrapper and Instance. </p>
  *
  * <p> Wrap also helps packing optimization and 3d-visualization with its own members
  * {@link orientation} and position variables {@link x}, {@link y} and {@link z}. </p>
  *
  * @author Jeongho Nam <http://samchon.org>
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.Entity * / any */ @js.native
trait Wrap extends js.Object {
  @JSName("$instanceName")
  val $instanceName: String = js.native
  @JSName("$layoutScale")
  val $layoutScale: String = js.native
  @JSName("$position")
  val $position: String = js.native
  /**
    * An instance wrapped into the {@link wrapper}.
    */
  var instance: Instance = js.native
  /**
    * Placement orientation of wrapped {@link instance}.
    */
  var orientation: Double = js.native
  /**
    * A wrapper wrapping the {@link instance}.
    */
  var wrapper: Wrapper = js.native
  /**
    * Coordinate-X of the instance placement in the wrapper.
    */
  var x: Double = js.native
  /**
    * Coordinate-Y of the instance placement in the wrapper.
    */
  var y: Double = js.native
  /**
    * Coordinate-Z of the instance placement in the wrapper.
    */
  var z: Double = js.native
  /**
    * @inheritdoc
    */
  def TAG(): String = js.native
  /**
    * @brief Orientation change is occured in level of the packer.
    *
    * @details orientation Packer's new orientation.
    */
  def changeWrapperOrientation(orientation: Double): Unit = js.native
  /**
    * @inheritdoc
    */
  def construct(
    xml: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any
  ): Unit = js.native
  /**
    * Factory method of wrapped Instance.
    *
    * @param type Type of contained Instance's type.
    */
  /* protected */ def createInstance(`type`: String): Instance = js.native
  /**
    * @brief Estimate orientation by given size.
    *
    * @param width Width by placement.
    * @param height Height by placement.
    * @param length Length by placement.
    */
  def estimateOrientation(width: Double, height: Double, length: Double): Unit = js.native
  /**
    * Get instance.
    */
  def getInstance(): Instance = js.native
  /**
    * Get height.
    */
  def getLayoutHeight(): Double = js.native
  /**
    * Get width.
    */
  def getLayoutWidth(): Double = js.native
  /**
    * Get length.
    */
  def getLength(): Double = js.native
  /**
    * Get orientation.
    */
  def getOrientation(): Double = js.native
  /**
    * Get volume.
    */
  def getVolume(): Double = js.native
  /**
    * Get wrapper.
    */
  def getWrapper(): Wrapper = js.native
  /**
    * Get x.
    */
  def getX(): Double = js.native
  /**
    * Get y.
    */
  def getY(): Double = js.native
  /**
    * Get z.
    */
  def getZ(): Double = js.native
  /**
    * Set orientation.
    *
    * @param orientation Orientation code (1 to 6).
    */
  def setOrientation(orientation: Double): Unit = js.native
  /**
    * Set position.
    *
    * @param x Coordinate-X of the instance placement in the wrapper.
    * @param y Coordinate-Y of the instance placement in the wrapper.
    * @param z Coordinate-Z of the instance placement in the wrapper.
    */
  def setPosition(x: Double, y: Double, z: Double): Unit = js.native
  /**
    * @inheritdoc
    */
  def toXML(): js.Any = js.native
}

object Wrap {
  @scala.inline
  def apply(
    $instanceName: String,
    $layoutScale: String,
    $position: String,
    TAG: () => String,
    changeWrapperOrientation: Double => Unit,
    construct: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any => Unit,
    createInstance: String => Instance,
    estimateOrientation: (Double, Double, Double) => Unit,
    getInstance: () => Instance,
    getLayoutHeight: () => Double,
    getLayoutWidth: () => Double,
    getLength: () => Double,
    getOrientation: () => Double,
    getVolume: () => Double,
    getWrapper: () => Wrapper,
    getX: () => Double,
    getY: () => Double,
    getZ: () => Double,
    instance: Instance,
    orientation: Double,
    setOrientation: Double => Unit,
    setPosition: (Double, Double, Double) => Unit,
    toXML: () => js.Any,
    wrapper: Wrapper,
    x: Double,
    y: Double,
    z: Double
  ): Wrap = {
    val __obj = js.Dynamic.literal($instanceName = $instanceName.asInstanceOf[js.Any], $layoutScale = $layoutScale.asInstanceOf[js.Any], $position = $position.asInstanceOf[js.Any], TAG = js.Any.fromFunction0(TAG), changeWrapperOrientation = js.Any.fromFunction1(changeWrapperOrientation), construct = js.Any.fromFunction1(construct), createInstance = js.Any.fromFunction1(createInstance), estimateOrientation = js.Any.fromFunction3(estimateOrientation), getInstance = js.Any.fromFunction0(getInstance), getLayoutHeight = js.Any.fromFunction0(getLayoutHeight), getLayoutWidth = js.Any.fromFunction0(getLayoutWidth), getLength = js.Any.fromFunction0(getLength), getOrientation = js.Any.fromFunction0(getOrientation), getVolume = js.Any.fromFunction0(getVolume), getWrapper = js.Any.fromFunction0(getWrapper), getX = js.Any.fromFunction0(getX), getY = js.Any.fromFunction0(getY), getZ = js.Any.fromFunction0(getZ), instance = instance.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], setOrientation = js.Any.fromFunction1(setOrientation), setPosition = js.Any.fromFunction3(setPosition), toXML = js.Any.fromFunction0(toXML), wrapper = wrapper.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[Wrap]
  }
  @scala.inline
  implicit class WrapOps[Self <: Wrap] (val x: Self) extends AnyVal {
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
    def set$instanceName(value: String): Self = this.set("$instanceName", value.asInstanceOf[js.Any])
    @scala.inline
    def set$layoutScale(value: String): Self = this.set("$layoutScale", value.asInstanceOf[js.Any])
    @scala.inline
    def set$position(value: String): Self = this.set("$position", value.asInstanceOf[js.Any])
    @scala.inline
    def setTAG(value: () => String): Self = this.set("TAG", js.Any.fromFunction0(value))
    @scala.inline
    def setChangeWrapperOrientation(value: Double => Unit): Self = this.set("changeWrapperOrientation", js.Any.fromFunction1(value))
    @scala.inline
    def setConstruct(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any => Unit
    ): Self = this.set("construct", js.Any.fromFunction1(value))
    @scala.inline
    def setCreateInstance(value: String => Instance): Self = this.set("createInstance", js.Any.fromFunction1(value))
    @scala.inline
    def setEstimateOrientation(value: (Double, Double, Double) => Unit): Self = this.set("estimateOrientation", js.Any.fromFunction3(value))
    @scala.inline
    def setGetInstance(value: () => Instance): Self = this.set("getInstance", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLayoutHeight(value: () => Double): Self = this.set("getLayoutHeight", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLayoutWidth(value: () => Double): Self = this.set("getLayoutWidth", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLength(value: () => Double): Self = this.set("getLength", js.Any.fromFunction0(value))
    @scala.inline
    def setGetOrientation(value: () => Double): Self = this.set("getOrientation", js.Any.fromFunction0(value))
    @scala.inline
    def setGetVolume(value: () => Double): Self = this.set("getVolume", js.Any.fromFunction0(value))
    @scala.inline
    def setGetWrapper(value: () => Wrapper): Self = this.set("getWrapper", js.Any.fromFunction0(value))
    @scala.inline
    def setGetX(value: () => Double): Self = this.set("getX", js.Any.fromFunction0(value))
    @scala.inline
    def setGetY(value: () => Double): Self = this.set("getY", js.Any.fromFunction0(value))
    @scala.inline
    def setGetZ(value: () => Double): Self = this.set("getZ", js.Any.fromFunction0(value))
    @scala.inline
    def setInstance(value: Instance): Self = this.set("instance", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrientation(value: Double): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetOrientation(value: Double => Unit): Self = this.set("setOrientation", js.Any.fromFunction1(value))
    @scala.inline
    def setSetPosition(value: (Double, Double, Double) => Unit): Self = this.set("setPosition", js.Any.fromFunction3(value))
    @scala.inline
    def setToXML(value: () => js.Any): Self = this.set("toXML", js.Any.fromFunction0(value))
    @scala.inline
    def setWrapper(value: Wrapper): Self = this.set("wrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setZ(value: Double): Self = this.set("z", value.asInstanceOf[js.Any])
  }
  
}

