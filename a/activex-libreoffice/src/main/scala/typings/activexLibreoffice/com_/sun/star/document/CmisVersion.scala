package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.com_.sun.star.util.DateTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a CMIS document version. */
@js.native
trait CmisVersion extends StObject {
  
  /** contains the author that created the version. */
  var Author: String = js.native
  
  /** contains the comment the author has left. */
  var Comment: String = js.native
  
  /** unique ID of the Cmis version */
  var Id: String = js.native
  
  /** specifies the time when the revision was created. */
  var TimeStamp: DateTime = js.native
}
object CmisVersion {
  
  @scala.inline
  def apply(Author: String, Comment: String, Id: String, TimeStamp: DateTime): CmisVersion = {
    val __obj = js.Dynamic.literal(Author = Author.asInstanceOf[js.Any], Comment = Comment.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], TimeStamp = TimeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CmisVersion]
  }
  
  @scala.inline
  implicit class CmisVersionMutableBuilder[Self <: CmisVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: String): Self = StObject.set(x, "Author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeStamp(value: DateTime): Self = StObject.set(x, "TimeStamp", value.asInstanceOf[js.Any])
  }
}
