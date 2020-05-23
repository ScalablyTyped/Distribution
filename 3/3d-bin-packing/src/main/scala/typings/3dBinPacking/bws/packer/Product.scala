package typings.`3dBinPacking`.bws.packer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A product.
  *
  * @author Jeongho Nam <http://samchon.org>
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.Entity * / any */ trait Product extends Instance {
  /**
    * Height of the Product, length on the Y-axis in 3D.
    */
  var height: Double
  /**
    * Length of the Product, length on the Z-axis in 3D.
    */
  var length: Double
  /**
    * <p> Name, key of the Product. </p>
    *
    * <p> The name must be unique because a name identifies a {@link Product}. </p>
    */
  var name: String
  /**
    * Width of the Product, length on the X-axis in 3D.
    */
  var width: Double
  /**
    * @inheritdoc
    */
  def TAG(): String
  /**
    * Key of a Product is its name.
    */
  def key(): js.Any
  /**
    * @inheritdoc
    */
  def toXML(): js.Any
}

object Product {
  @scala.inline
  def apply(
    TAG: () => String,
    TYPE: () => String,
    getHeight: () => Double,
    getLength: () => Double,
    getName: () => String,
    getVolume: () => Double,
    getWidth: () => Double,
    height: Double,
    key: () => js.Any,
    length: Double,
    name: String,
    setHeight: Double => Unit,
    setLength: Double => Unit,
    setName: String => Unit,
    setWidth: Double => Unit,
    toXML: () => js.Any,
    width: Double
  ): Product = {
    val __obj = js.Dynamic.literal(TAG = js.Any.fromFunction0(TAG), TYPE = js.Any.fromFunction0(TYPE), getHeight = js.Any.fromFunction0(getHeight), getLength = js.Any.fromFunction0(getLength), getName = js.Any.fromFunction0(getName), getVolume = js.Any.fromFunction0(getVolume), getWidth = js.Any.fromFunction0(getWidth), height = height.asInstanceOf[js.Any], key = js.Any.fromFunction0(key), length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], setHeight = js.Any.fromFunction1(setHeight), setLength = js.Any.fromFunction1(setLength), setName = js.Any.fromFunction1(setName), setWidth = js.Any.fromFunction1(setWidth), toXML = js.Any.fromFunction0(toXML), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Product]
  }
}

