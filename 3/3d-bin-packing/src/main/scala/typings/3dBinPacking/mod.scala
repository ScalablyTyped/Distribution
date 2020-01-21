package typings.`3dBinPacking`

import typings.`3dBinPacking`.bws.packer.Instance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("3d-bin-packing", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class GAWrapperArray protected ()
    extends typings.`3dBinPacking`.bws.packer.GAWrapperArray {
    /**
      * @brief Copy Constructor.
      */
    def this(genes: typings.`3dBinPacking`.bws.packer.GAWrapperArray) = this()
    /**
      * Construct from instances.
      *
      * @param instanceArray Instances to be wrapped.
      */
    def this(instanceArray: typings.`3dBinPacking`.bws.packer.InstanceArray) = this()
  }
  
  /**
    * An array of Instance objects.
    *
    * @author Jeongho Nam <http://samchon.org>
    */
  @js.native
  /**
    * Default Constructor.
    */
  class InstanceArray ()
    extends typings.`3dBinPacking`.bws.packer.InstanceArray
  
  /**
    * <p> A repeated Instance. </p>
    *
    * <p> InstanceForm is an utility class for repeated {@link Instance}. It is designed for shrinking
    * volume of network message I/O by storing {@link count repeated count}. </p>
    *
    * @author Jeongho Nam <http://samchon.org>
    */
  @js.native
  /**
    * Default Constructor.
    */
  class InstanceForm ()
    extends typings.`3dBinPacking`.bws.packer.InstanceForm {
    def this(instance: Instance) = this()
    def this(instance: Instance, count: Double) = this()
  }
  
  /**
    * An array of {@link InstanceForm} objects.
    *
    * @author Jeongho Nam <http://samchon.org>
    */
  @js.native
  /**
    * Default Constructor.
    */
  class InstanceFormArray ()
    extends typings.`3dBinPacking`.bws.packer.InstanceFormArray
  
  /**
    * @brief Packer, a solver of 3d bin packing with multiple wrappers.
    *
    * @details
    * <p> Packer is a facade class supporting packing operations in user side. You can solve a packing problem
    * by constructing Packer class with {@link WrapperArray wrappers} and {@link InstanceArray instances} to
    * pack and executing {@link optimize Packer.optimize()} method. </p>
    *
    * <p> In background side, deducting packing solution, those algorithms are used. </p>
    * <ul>
    *	<li> <a href="http://betterwaysystems.github.io/packer/reference/AirForceBinPacking.pdf" target="_blank">
    *		Airforce Bin Packing; 3D pallet packing problem: A human intelligence-based heuristic approach </a>
    *	</li>
    *	<li> Genetic Algorithm </li>
    *	<li> Greedy and Back-tracking algorithm </li>
    * </ul>
    *
    * @author Jeongho Nam <http://samchon.org>
    */
  @js.native
  /**
    * Default Constructor.
    */
  class Packer ()
    extends typings.`3dBinPacking`.bws.packer.Packer {
    /**
      * Construct from members.
      *
      * @param wrapperArray Candidate wrappers who can contain instances.
      * @param instanceArray Instances to be packed into some wrappers.
      */
    def this(
      wrapperArray: typings.`3dBinPacking`.bws.packer.WrapperArray,
      instanceArray: typings.`3dBinPacking`.bws.packer.InstanceArray
    ) = this()
  }
  
  /**
    * Bridge of {@link Packer} for {@link InstanceForm repeated instances}.
    *
    * @author Jeongho Nam <http://samchon.org>
    */
  @js.native
  /**
    * Default Constructor.
    */
  class PackerForm ()
    extends typings.`3dBinPacking`.bws.packer.PackerForm {
    /**
      * Initializer Constructor.
      *
      * @param instanceFormArray Form of Instances to pack.
      * @param wrapperArray Type of Wrappers to be used.
      */
    def this(
      instanceFormArray: typings.`3dBinPacking`.bws.packer.InstanceFormArray,
      wrapperArray: typings.`3dBinPacking`.bws.packer.WrapperArray
    ) = this()
  }
  
  /**
    * A product.
    *
    * @author Jeongho Nam <http://samchon.org>
    */
  @js.native
  /**
    * Default Constructor.
    */
  class Product ()
    extends typings.`3dBinPacking`.bws.packer.Product {
    /**
      * Construct from members.
      *
      * @param name Name, identifier of the Product.
      * @param width Width, length on the X-axis in 3D.
      * @param height Height, length on the Y-axis in 3D.
      * @param length Length, length on the Z-axis in 3D.
      */
    def this(name: String, width: Double, height: Double, length: Double) = this()
  }
  
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
  @js.native
  class Wrap protected ()
    extends typings.`3dBinPacking`.bws.packer.Wrap {
    /**
      * Construct from a Wrapper.
      *
      * @param wrapper A wrapper who will contain an instance.
      */
    def this(wrapper: typings.`3dBinPacking`.bws.packer.Wrapper) = this()
    /**
      * Construct from a Wrapper and Instance with its position and default orientation 1.
      *
      * @param wrapper A wrapper who contains the instance.
      * @param instance An instance contained into the wrapper.
      * @param x Coordinate-X of the {@link instance} placement in the {@link wrapper}.
      * @param y Coordinate-Y of the {@link instance} placement in the {@link wrapper}.
      * @param z Coordinate-Z of the {@link instance} placement in the {@link wrapper}.
      */
    def this(
      wrapper: typings.`3dBinPacking`.bws.packer.Wrapper,
      instance: Instance,
      x: Double,
      y: Double,
      z: Double
    ) = this()
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
    def this(
      wrapper: typings.`3dBinPacking`.bws.packer.Wrapper,
      instance: Instance,
      x: Double,
      y: Double,
      z: Double,
      orientation: Double
    ) = this()
  }
  
  /**
    * A wrapper wrapping instances.
    *
    * @author Jeongho Nam <http://samchon.org>
    */
  @js.native
  /**
    * Default Constructor.
    */
  class Wrapper ()
    extends typings.`3dBinPacking`.bws.packer.Wrapper {
    /**
      * Copy Constructor.
      */
    def this(wrapper: typings.`3dBinPacking`.bws.packer.Wrapper) = this()
    /**
      * Construct from members.
      *
      * @param name Name, identifier of a Wrapper.
      * @param price Price, issued cost for a type of the Wrapper.
      * @param width Width, dimensional length on the X-axis in 3D.
      * @param height Height, dimensional length on the Y-axis in 3D.
      * @param length Length, dimensional length on the Z-axis in 3D.
      * @param thickness A thickness causes shrinkness on containable volume.
      */
    def this(name: String, price: Double, width: Double, height: Double, length: Double, thickness: Double) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  class WrapperArray ()
    extends typings.`3dBinPacking`.bws.packer.WrapperArray
  
  /**
    * A group of {@link Wrapper Wrappers} with same type.
    *
    * @author Jeongho Nam <http://samchon.org>
    */
  @js.native
  /**
    * Default Constructor.
    */
  class WrapperGroup ()
    extends typings.`3dBinPacking`.bws.packer.WrapperGroup {
    /**
      * Construct from a sample.
      *
      * @param sample A sample, standard of the WrapperGroup.
      */
    def this(sample: typings.`3dBinPacking`.bws.packer.Wrapper) = this()
    /**
      * Copy Constructor.
      */
    def this(wrapperGroup: typings.`3dBinPacking`.bws.packer.WrapperGroup) = this()
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
  }
  
  @JSName("_Test")
  def Test(): Unit = js.native
}

