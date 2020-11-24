package typings.activexLibreoffice.com_.sun.star.xml.xpath

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.xml.dom.XNodeList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XXPathObject extends XInterface {
  
  /** get value of a boolean object */
  val Boolean: scala.Boolean = js.native
  
  /** get number as byte */
  val Byte: scala.Double = js.native
  
  /** get number as double */
  val Double: scala.Double = js.native
  
  /** get number as float */
  val Float: scala.Double = js.native
  
  /** get number as hyper */
  val Hyper: scala.Double = js.native
  
  /** get number as long */
  val Long: scala.Double = js.native
  
  /** get the nodes from a node list type object */
  val NodeList: XNodeList = js.native
  
  /** get object type */
  val ObjectType: XPathObjectType = js.native
  
  /** get number as short */
  val Short: scala.Double = js.native
  
  /** get string value */
  val String: java.lang.String = js.native
  
  /** get value of a boolean object */
  def getBoolean(): scala.Boolean = js.native
  
  /** get number as byte */
  def getByte(): scala.Double = js.native
  
  /** get number as double */
  def getDouble(): scala.Double = js.native
  
  /** get number as float */
  def getFloat(): scala.Double = js.native
  
  /** get number as hyper */
  def getHyper(): scala.Double = js.native
  
  /** get number as long */
  def getLong(): scala.Double = js.native
  
  /** get the nodes from a node list type object */
  def getNodeList(): XNodeList = js.native
  
  /** get object type */
  def getObjectType(): XPathObjectType = js.native
  
  /** get number as short */
  def getShort(): scala.Double = js.native
  
  /** get string value */
  def getString(): java.lang.String = js.native
}
object XXPathObject {
  
  @scala.inline
  def apply(
    Boolean: Boolean,
    Byte: Double,
    Double: Double,
    Float: Double,
    Hyper: Double,
    Long: Double,
    NodeList: XNodeList,
    ObjectType: XPathObjectType,
    Short: Double,
    String: String,
    acquire: () => Unit,
    getBoolean: () => Boolean,
    getByte: () => Double,
    getDouble: () => Double,
    getFloat: () => Double,
    getHyper: () => Double,
    getLong: () => Double,
    getNodeList: () => XNodeList,
    getObjectType: () => XPathObjectType,
    getShort: () => Double,
    getString: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XXPathObject = {
    val __obj = js.Dynamic.literal(Boolean = Boolean.asInstanceOf[js.Any], Byte = Byte.asInstanceOf[js.Any], Double = Double.asInstanceOf[js.Any], Float = Float.asInstanceOf[js.Any], Hyper = Hyper.asInstanceOf[js.Any], Long = Long.asInstanceOf[js.Any], NodeList = NodeList.asInstanceOf[js.Any], ObjectType = ObjectType.asInstanceOf[js.Any], Short = Short.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getBoolean = js.Any.fromFunction0(getBoolean), getByte = js.Any.fromFunction0(getByte), getDouble = js.Any.fromFunction0(getDouble), getFloat = js.Any.fromFunction0(getFloat), getHyper = js.Any.fromFunction0(getHyper), getLong = js.Any.fromFunction0(getLong), getNodeList = js.Any.fromFunction0(getNodeList), getObjectType = js.Any.fromFunction0(getObjectType), getShort = js.Any.fromFunction0(getShort), getString = js.Any.fromFunction0(getString), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XXPathObject]
  }
  
  @scala.inline
  implicit class XXPathObjectOps[Self <: XXPathObject] (val x: Self) extends AnyVal {
    
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
    def setBoolean(value: Boolean): Self = this.set("Boolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByte(value: Double): Self = this.set("Byte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDouble(value: Double): Self = this.set("Double", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloat(value: Double): Self = this.set("Float", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyper(value: Double): Self = this.set("Hyper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLong(value: Double): Self = this.set("Long", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeList(value: XNodeList): Self = this.set("NodeList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectType(value: XPathObjectType): Self = this.set("ObjectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShort(value: Double): Self = this.set("Short", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setString(value: String): Self = this.set("String", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetBoolean(value: () => Boolean): Self = this.set("getBoolean", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetByte(value: () => Double): Self = this.set("getByte", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDouble(value: () => Double): Self = this.set("getDouble", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFloat(value: () => Double): Self = this.set("getFloat", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHyper(value: () => Double): Self = this.set("getHyper", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLong(value: () => Double): Self = this.set("getLong", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNodeList(value: () => XNodeList): Self = this.set("getNodeList", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetObjectType(value: () => XPathObjectType): Self = this.set("getObjectType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetShort(value: () => Double): Self = this.set("getShort", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetString(value: () => String): Self = this.set("getString", js.Any.fromFunction0(value))
  }
}
