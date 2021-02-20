package typings.activexLibreoffice.com_.sun.star.xml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A struct to keep information of an element's attribute. */
@js.native
trait Attribute extends StObject {
  
  /** the attribute name */
  var Name: String = js.native
  
  /** the attribute namespace URL */
  var NamespaceURL: String = js.native
  
  /** the attribute value */
  var Value: String = js.native
}
object Attribute {
  
  @scala.inline
  def apply(Name: String, NamespaceURL: String, Value: String): Attribute = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], NamespaceURL = NamespaceURL.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attribute]
  }
  
  @scala.inline
  implicit class AttributeMutableBuilder[Self <: Attribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceURL(value: String): Self = StObject.set(x, "NamespaceURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
