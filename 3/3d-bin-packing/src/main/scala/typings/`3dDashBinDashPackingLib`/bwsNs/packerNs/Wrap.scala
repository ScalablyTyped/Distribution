package typings
package `3dDashBinDashPackingLib`.bwsNs.packerNs

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
- Dropped any */ @JSGlobal("bws.packer.Wrap")
@js.native
class Wrap protected () extends js.Object {
  /**
    * Construct from a Wrapper.
    *
    * @param wrapper A wrapper who will contain an instance.
    */
  def this(wrapper: Wrapper) = this()
  /**
    * Construct from a Wrapper and Instance with its position and default orientation 1.
    *
    * @param wrapper A wrapper who contains the instance.
    * @param instance An instance contained into the wrapper.
    * @param x Coordinate-X of the {@link instance} placement in the {@link wrapper}.
    * @param y Coordinate-Y of the {@link instance} placement in the {@link wrapper}.
    * @param z Coordinate-Z of the {@link instance} placement in the {@link wrapper}.
    */
  def this(wrapper: Wrapper, instance: Instance, x: scala.Double, y: scala.Double, z: scala.Double) = this()
  /**
    * Construct from a Wrapper and Instance with its position and orientation.
    *
    * @param wrapper A wrapper who contains the instance.
    * @param instance An instance contained into the wrapper.
    * @param x Coordinate-X of the {@link instance} placement in the {@link wrapper}.
    * @param y Coordinate-Y of the {@link instance} placement in the {@link wrapper}.
    * @param z Coordinate-Z of the {@link instance} placement in the {@link wrapper}.
    * @param orientation Placement orientation of wrapped {@link instance}.
    */
  def this(wrapper: Wrapper, instance: Instance, x: scala.Double, y: scala.Double, z: scala.Double, orientation: scala.Double) = this()
  @JSName("$instanceName")
  val $instanceName: java.lang.String = js.native
  @JSName("$layoutScale")
  val $layoutScale: java.lang.String = js.native
  @JSName("$position")
  val $position: java.lang.String = js.native
  /**
    * An instance wrapped into the {@link wrapper}.
    */
  var instance: Instance = js.native
  /**
    * Placement orientation of wrapped {@link instance}.
    */
  var orientation: scala.Double = js.native
  /**
    * A wrapper wrapping the {@link instance}.
    */
  var wrapper: Wrapper = js.native
  /**
    * Coordinate-X of the instance placement in the wrapper.
    */
  var x: scala.Double = js.native
  /**
    * Coordinate-Y of the instance placement in the wrapper.
    */
  var y: scala.Double = js.native
  /**
    * Coordinate-Z of the instance placement in the wrapper.
    */
  var z: scala.Double = js.native
  /**
    * @inheritdoc
    */
  def TAG(): java.lang.String = js.native
  /**
    * @brief Orientation change is occured in level of the packer.
    *
    * @details orientation Packer's new orientation.
    */
  def changeWrapperOrientation(orientation: scala.Double): scala.Unit = js.native
  /**
    * @inheritdoc
    */
  def construct(
    xml: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify library.XML */ js.Any
  ): scala.Unit = js.native
  /**
    * Factory method of wrapped Instance.
    *
    * @param type Type of contained Instance's type.
    */
  /* protected */ def createInstance(`type`: java.lang.String): Instance = js.native
  /**
    * @brief Estimate orientation by given size.
    *
    * @param width Width by placement.
    * @param height Height by placement.
    * @param length Length by placement.
    */
  def estimateOrientation(width: scala.Double, height: scala.Double, length: scala.Double): scala.Unit = js.native
  /**
    * Get instance.
    */
  def getInstance(): Instance = js.native
  /**
    * Get height.
    */
  def getLayoutHeight(): scala.Double = js.native
  /**
    * Get width.
    */
  def getLayoutWidth(): scala.Double = js.native
  /**
    * Get length.
    */
  def getLength(): scala.Double = js.native
  /**
    * Get orientation.
    */
  def getOrientation(): scala.Double = js.native
  /**
    * Get volume.
    */
  def getVolume(): scala.Double = js.native
  /**
    * Get wrapper.
    */
  def getWrapper(): Wrapper = js.native
  /**
    * Get x.
    */
  def getX(): scala.Double = js.native
  /**
    * Get y.
    */
  def getY(): scala.Double = js.native
  /**
    * Get z.
    */
  def getZ(): scala.Double = js.native
  /**
    * Set orientation.
    *
    * @param orientation Orientation code (1 to 6).
    */
  def setOrientation(orientation: scala.Double): scala.Unit = js.native
  /**
    * Set position.
    *
    * @param x Coordinate-X of the instance placement in the wrapper.
    * @param y Coordinate-Y of the instance placement in the wrapper.
    * @param z Coordinate-Z of the instance placement in the wrapper.
    */
  def setPosition(x: scala.Double, y: scala.Double, z: scala.Double): scala.Unit = js.native
  /**
    * @inheritdoc
    */
  def toXML(): js.Any = js.native
}

