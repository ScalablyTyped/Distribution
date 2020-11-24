package typings.`3dBinPacking`.bws.packer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A wrapper wrapping instances.
  *
  * @author Jeongho Nam <http://samchon.org>
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.EntityDeque<Wrap> * / any */ @js.native
trait Wrapper extends Instance {
  
  @JSName("$height")
  var $height: String = js.native
  
  @JSName("$length")
  var $length: String = js.native
  
  @JSName("$name")
  var $name: String = js.native
  
  @JSName("$price")
  var $price: String = js.native
  
  @JSName("$scale")
  val $scale: String = js.native
  
  @JSName("$spaceUtilization")
  val $spaceUtilization: String = js.native
  
  @JSName("$thickness")
  var $thickness: String = js.native
  
  @JSName("$width")
  var $width: String = js.native
  
  /**
    * @inheritdoc
    */
  def CHILD_TAG(): String = js.native
  
  /**
    * @inheritdoc
    */
  def TAG(): String = js.native
  
  /**
    * <p> Wrapper is enough greater? </p>
    *
    * <p> Test whether the Wrapper is enough greater than an Instance to contain. </p>
    *
    * @param instance An Instance to test.
    * @return Enough greater or not.
    */
  def containable(instance: Instance): Boolean = js.native
  
  /**
    * @inheritdoc
    */
  def createChild(
    xml: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any
  ): Wrap = js.native
  
  def equals(obj: Wrapper): Boolean = js.native
  
  /**
    * <p> Get (calculate) containable height, length on the Y-axis in 3D. </p>
    *
    * <p> Calculates containable height considering the {@link thickness}. </p>
    *
    * @return height - (2 x thickness)
    */
  def getContainableHeight(): Double = js.native
  
  /**
    * <p> Get (calculate) containable length, length on the Z-axis in 3D. </p>
    *
    * <p> Calculates containable length considering the {@link thickness}. </p>
    *
    * @return length - (2 x thickness)
    */
  def getContainableLength(): Double = js.native
  
  /**
    * <p> Get (calculate) containable volume. </p>
    *
    * <p> Calculates containable volume considering the {@link thickness}. </p>
    *
    * @return volume - {(2 x thickness) ^ 3}
    */
  def getContainableVolume(): Double = js.native
  
  /**
    * <p> Get (calculate) containable width, length on the X-axis in 3D. </p>
    *
    * <p> Calculates containable width considering the {@link thickness}. </p>
    *
    * @return width - (2 x thickness)
    */
  def getContainableWidth(): Double = js.native
  
  /**
    * Get price.
    */
  def getPrice(): Double = js.native
  
  /**
    * Get thickness.
    */
  def getThickness(): Double = js.native
  
  /**
    * Get utilization ratio of containable volume.
    *
    * @return utilization ratio.
    */
  def getUtilization(): Double = js.native
  
  /**
    * Height of the Wrapper, length on the Y-axis in 3D.
    */
  var height: Double = js.native
  
  /**
    * Key of a Wrapper is its name.
    */
  def key(): js.Any = js.native
  
  /**
    * Length of the Wrapper, length on the Z-axis in 3D.
    */
  var length: Double = js.native
  
  /**
    * <p> Name, key of the Wrapper. </p>
    *
    * <p> The name represents a type of Wrapper and identifies the Wrapper. </p>
    */
  var name: String = js.native
  
  /**
    * Price, cost of using an Wrapper.
    */
  var price: Double = js.native
  
  /**
    * Set price.
    */
  def setPrice(`val`: Double): Unit = js.native
  
  /**
    * Set thickness.
    */
  def setThickness(`val`: Double): Unit = js.native
  
  /**
    * <p> Thickness, margin of a Wrapper causes shrinkness of containable volume. </p>
    *
    * <p> The thickness reduces each dimension's containable size (dimension - 2*thickness),
    * so finally, it reduces total containable volume (-8 * thickness^3). </p>
    */
  var thickness: Double = js.native
  
  /**
    * @inheritdoc
    */
  def toXML(): js.Any = js.native
  
  /**
    * Width of the Wrapper, length on the X-axis in 3D.
    */
  var width: Double = js.native
}
object Wrapper {
  
  @scala.inline
  def apply(
    $height: String,
    $length: String,
    $name: String,
    $price: String,
    $scale: String,
    $spaceUtilization: String,
    $thickness: String,
    $width: String,
    CHILD_TAG: () => String,
    TAG: () => String,
    TYPE: () => String,
    containable: Instance => Boolean,
    createChild: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any => Wrap,
    equals: Wrapper => Boolean,
    getContainableHeight: () => Double,
    getContainableLength: () => Double,
    getContainableVolume: () => Double,
    getContainableWidth: () => Double,
    getHeight: () => Double,
    getLength: () => Double,
    getName: () => String,
    getPrice: () => Double,
    getThickness: () => Double,
    getUtilization: () => Double,
    getVolume: () => Double,
    getWidth: () => Double,
    height: Double,
    key: () => js.Any,
    length: Double,
    name: String,
    price: Double,
    setHeight: Double => Unit,
    setLength: Double => Unit,
    setName: String => Unit,
    setPrice: Double => Unit,
    setThickness: Double => Unit,
    setWidth: Double => Unit,
    thickness: Double,
    toXML: () => js.Any,
    width: Double
  ): Wrapper = {
    val __obj = js.Dynamic.literal($height = $height.asInstanceOf[js.Any], $length = $length.asInstanceOf[js.Any], $name = $name.asInstanceOf[js.Any], $price = $price.asInstanceOf[js.Any], $scale = $scale.asInstanceOf[js.Any], $spaceUtilization = $spaceUtilization.asInstanceOf[js.Any], $thickness = $thickness.asInstanceOf[js.Any], $width = $width.asInstanceOf[js.Any], CHILD_TAG = js.Any.fromFunction0(CHILD_TAG), TAG = js.Any.fromFunction0(TAG), TYPE = js.Any.fromFunction0(TYPE), containable = js.Any.fromFunction1(containable), createChild = js.Any.fromFunction1(createChild), equals = js.Any.fromFunction1(equals), getContainableHeight = js.Any.fromFunction0(getContainableHeight), getContainableLength = js.Any.fromFunction0(getContainableLength), getContainableVolume = js.Any.fromFunction0(getContainableVolume), getContainableWidth = js.Any.fromFunction0(getContainableWidth), getHeight = js.Any.fromFunction0(getHeight), getLength = js.Any.fromFunction0(getLength), getName = js.Any.fromFunction0(getName), getPrice = js.Any.fromFunction0(getPrice), getThickness = js.Any.fromFunction0(getThickness), getUtilization = js.Any.fromFunction0(getUtilization), getVolume = js.Any.fromFunction0(getVolume), getWidth = js.Any.fromFunction0(getWidth), height = height.asInstanceOf[js.Any], key = js.Any.fromFunction0(key), length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], setHeight = js.Any.fromFunction1(setHeight), setLength = js.Any.fromFunction1(setLength), setName = js.Any.fromFunction1(setName), setPrice = js.Any.fromFunction1(setPrice), setThickness = js.Any.fromFunction1(setThickness), setWidth = js.Any.fromFunction1(setWidth), thickness = thickness.asInstanceOf[js.Any], toXML = js.Any.fromFunction0(toXML), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Wrapper]
  }
  
  @scala.inline
  implicit class WrapperOps[Self <: Wrapper] (val x: Self) extends AnyVal {
    
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
    def set$height(value: String): Self = this.set("$height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$length(value: String): Self = this.set("$length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$name(value: String): Self = this.set("$name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$price(value: String): Self = this.set("$price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$scale(value: String): Self = this.set("$scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$spaceUtilization(value: String): Self = this.set("$spaceUtilization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$thickness(value: String): Self = this.set("$thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$width(value: String): Self = this.set("$width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCHILD_TAG(value: () => String): Self = this.set("CHILD_TAG", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTAG(value: () => String): Self = this.set("TAG", js.Any.fromFunction0(value))
    
    @scala.inline
    def setContainable(value: Instance => Boolean): Self = this.set("containable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateChild(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any => Wrap
    ): Self = this.set("createChild", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEquals(value: Wrapper => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetContainableHeight(value: () => Double): Self = this.set("getContainableHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetContainableLength(value: () => Double): Self = this.set("getContainableLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetContainableVolume(value: () => Double): Self = this.set("getContainableVolume", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetContainableWidth(value: () => Double): Self = this.set("getContainableWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPrice(value: () => Double): Self = this.set("getPrice", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetThickness(value: () => Double): Self = this.set("getThickness", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUtilization(value: () => Double): Self = this.set("getUtilization", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: () => js.Any): Self = this.set("key", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrice(value: Double): Self = this.set("price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetPrice(value: Double => Unit): Self = this.set("setPrice", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetThickness(value: Double => Unit): Self = this.set("setThickness", js.Any.fromFunction1(value))
    
    @scala.inline
    def setThickness(value: Double): Self = this.set("thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToXML(value: () => js.Any): Self = this.set("toXML", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
