package typings.`3dDashBinDashPacking`.bwsNs.packerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A group of {@link Wrapper Wrappers} with same type.
  *
  * @author Jeongho Nam <http://samchon.org>
  */
@JSGlobal("bws.packer.WrapperGroup")
@js.native
/**
  * Default Constructor.
  */
class WrapperGroup () extends WrapperArray {
  /**
    * Construct from a sample.
    *
    * @param sample A sample, standard of the WrapperGroup.
    */
  def this(sample: Wrapper) = this()
  /**
    * Copy Constructor.
    */
  def this(wrapperGroup: WrapperGroup) = this()
  /**
    * Construct from members of the {@link sample}.
    *
    * @param name Name, identifier of the sample.
    * @param price Price, issued cost for a type of the sample.
    * @param width Width, dimensional length on the X-axis in 3D, of the sample.
    * @param height Height, dimensional length on the Y-axis in 3D, of the sample.
    * @param length Length, dimensional length on the Z-axis in 3D, of the sample.
    * @param thickness A thickness, causes shrinkness on containable volume, of the sample.
    */
  def this(name: String, price: Double, width: Double, height: Double, length: Double, thickness: Double) = this()
  /**
    * Allocated instances.
    */
  var allocatedInstanceArray: InstanceArray = js.native
  /**
    * <p> A sample, standard of the WrapperGroup. </p>
    *
    * <p> The sample represents what type of Wrappers are grouped into the WrapperGroup. </p>
    */
  var sample: Wrapper = js.native
  /**
    * <p> Allocate instance(s) to the WrapperGroup. </p>
    *
    * <p> Inspect the instance is enough small to be wrapped into an empty wrapper. If the instance
    * is enough small, registers the instance (or repeated instances) to the {@link reserveds} and
    * returns <code>true</code>. If the instance is too large to be capsuled, returns <code>false</code>. </p>
    *
    * <h4>Note</h4>
    * <p> The word <u>the instance is enough small to be wrapped into the empty wrapper</u> means
    * the instance can be contained into an empty, a new wrapper contaning nothing literally. </p>
    *
    * <p> In the method allocate(), it doesn't consider how many instances are wrapped into ordinary
    * wrapper and how much volumes are consumed.  </p>
    *
    * @param instance An Instance to allocate.
    * @param n Repeating number of the <i>instance</i>.
    *
    * @return Whether the instance is enough small to be wrapped into a (new) wrapper
    *		   of same type with the sample.
    */
  def allocate(instance: Instance): Boolean = js.native
  def allocate(instance: Instance, n: Double): Boolean = js.native
  /**
    * Get allocated instances.
    */
  def getAllocatedInstanceArray(): InstanceArray = js.native
  /**
    * Get sample.
    */
  def getSample(): Wrapper = js.native
  /**
    * Key of a WrapperGroup is dependent on its sample.
    */
  def key(): js.Any = js.native
  /**
    * <p> Run optimization in level of the group. </p>
    *
    * <p> The optimization routine begins by creating a {@link Wrapper} like the {@link sample}. Then
    * try to pack {@link allocatedInstanceArray allocated instances} to the {@link Wrapper} as a lot as
    * possible. If there're some {@link Wrappers} can't be packed by overloading, then create a new
    * {@link Wrapper} again and try to pack {@link allocatedInstanceArray instances} again, too. </p>
    *
    * <p> Repeats those steps until all {@link alloctedInstanceArray instances} are {@link Wrap packed}
    * so that there's not any {@link Instance instance} left. </p>
    *
    * <h4> Warning </h4>
    * <p> When call this {@link optimize optimize()} method, ordinary children {@link Wrapper} objects
    * in the {@link WrapperGroup} will be substituted with the newly optimized {@link Wrapper} objects. </p>
    */
  def optimize(): Unit = js.native
  /**
    * <p> Wrap allocated instances into <b>a new</b> {@link Wrapper}. </p>
    *
    * <p> {@link Wrap Wraps} instances to a new Wrapper which is copied from the sample. </p>
    * <p> After the wrapping is done, the new {@link Wrapper} is registered to the {@link WrapperGroup}
    * as a child and instances failed to wrap by overloading is returned. </p>
    *
    * @param instanceArray instances to {@link Wrap wrap} into <b>a new</b> {@link Wrapper}.
    *
    * @return Instances failed to {@link Wrap wrap} by overloading.
    * @see boxologic
    */
  /* private */ def pack(instanceArray: js.Any): js.Any = js.native
}

