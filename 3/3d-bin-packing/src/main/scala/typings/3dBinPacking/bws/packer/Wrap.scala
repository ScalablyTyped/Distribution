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
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.Entity * / any */ trait Wrap extends js.Object {
  @JSName("$instanceName")
  val $instanceName: String
  @JSName("$layoutScale")
  val $layoutScale: String
  @JSName("$position")
  val $position: String
  /**
    * An instance wrapped into the {@link wrapper}.
    */
  var instance: Instance
  /**
    * Placement orientation of wrapped {@link instance}.
    */
  var orientation: Double
  /**
    * A wrapper wrapping the {@link instance}.
    */
  var wrapper: Wrapper
  /**
    * Coordinate-X of the instance placement in the wrapper.
    */
  var x: Double
  /**
    * Coordinate-Y of the instance placement in the wrapper.
    */
  var y: Double
  /**
    * Coordinate-Z of the instance placement in the wrapper.
    */
  var z: Double
  /**
    * @inheritdoc
    */
  def TAG(): String
  /**
    * @brief Orientation change is occured in level of the packer.
    *
    * @details orientation Packer's new orientation.
    */
  def changeWrapperOrientation(orientation: Double): Unit
  /**
    * @inheritdoc
    */
  def construct(
    xml: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any
  ): Unit
  /**
    * Factory method of wrapped Instance.
    *
    * @param type Type of contained Instance's type.
    */
  /* protected */ def createInstance(`type`: String): Instance
  /**
    * @brief Estimate orientation by given size.
    *
    * @param width Width by placement.
    * @param height Height by placement.
    * @param length Length by placement.
    */
  def estimateOrientation(width: Double, height: Double, length: Double): Unit
  /**
    * Get instance.
    */
  def getInstance(): Instance
  /**
    * Get height.
    */
  def getLayoutHeight(): Double
  /**
    * Get width.
    */
  def getLayoutWidth(): Double
  /**
    * Get length.
    */
  def getLength(): Double
  /**
    * Get orientation.
    */
  def getOrientation(): Double
  /**
    * Get volume.
    */
  def getVolume(): Double
  /**
    * Get wrapper.
    */
  def getWrapper(): Wrapper
  /**
    * Get x.
    */
  def getX(): Double
  /**
    * Get y.
    */
  def getY(): Double
  /**
    * Get z.
    */
  def getZ(): Double
  /**
    * Set orientation.
    *
    * @param orientation Orientation code (1 to 6).
    */
  def setOrientation(orientation: Double): Unit
  /**
    * Set position.
    *
    * @param x Coordinate-X of the instance placement in the wrapper.
    * @param y Coordinate-Y of the instance placement in the wrapper.
    * @param z Coordinate-Z of the instance placement in the wrapper.
    */
  def setPosition(x: Double, y: Double, z: Double): Unit
  /**
    * @inheritdoc
    */
  def toXML(): js.Any
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
}

