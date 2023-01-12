package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.beans.Property
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A structure for information about contents.
  * @see XContentCreator
  * @see XCommandProcessor
  */
trait ContentInfo extends StObject {
  
  /**
    * Additional attributes.
    *
    * These flags contain extra information on the content, like its kind (KIND_FOLDER, KIND_DOCUMENT, KIND_LINK).
    *
    * It is highly recommended to fill these flags very accurately, as they are very important when transferring contents between different
    * ContentProviders.
    *
    * The value can be one of the {@link ContentInfoAttribute} constants.
    */
  var Attributes: Double
  
  /**
    * This field contains a list with the properties which must be set at a content that was just created using {@link XContentCreator.createNewContent()}
    * before it can be committed (by executing the command "insert" at the new content).
    *
    * If one of the properties is missing, the insert command will fail.
    *
    * In example, a new file system folder content will need a title. The Properties member of the {@link ContentInfo} provided for this kind of content
    * must include the property "Title".
    *
    * **Important:** The required properties must have one of the following basic data types (in order to make it possible to implement client applications
    * with a small set of generic input methods for the values):
    *
    * booleancharbytestringshortlonghyperfloatdouble
    */
  var Properties: SafeArray[Property]
  
  /**
    * A type identifier string for a content.
    *
    * This is an implementation specific string characterizing the kind of a content (e.g. "application/vnd.sun.star.hierarchy-link"). The value of this
    * member should match the value returned by {@link XContent.getContentType()} of an appropriate content.
    */
  var Type: String
}
object ContentInfo {
  
  inline def apply(Attributes: Double, Properties: SafeArray[Property], Type: String): ContentInfo = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentInfo] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Double): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: SafeArray[Property]): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
