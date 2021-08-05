package typings.activexLibreoffice.com_.sun.star.ucb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * contains information needed to checkin a document.
  *
  * The checkin command is always called on the target private working copy document.
  */
trait CheckinArgument extends StObject {
  
  /** Tells whether to create a new major or minor version during the checkin. */
  var MajorVersion: Boolean
  
  /** contains the Mime-Type of the content to check-in as it may be different from the original one. */
  var MimeType: String
  
  /**
    * contains the title of the transferred object, if it is different from the original one.
    *
    * If this field is filled, for example, a file will be renamed while it is being checked in.
    */
  var NewTitle: String
  
  /** contains the URL of the source of the action (e.g. the URL of the temporary file to checkin). */
  var SourceURL: String
  
  /** contains the URL of the private working copy to checkin. */
  var TargetURL: String
  
  /** Contains the version comment to set during the checkin. */
  var VersionComment: String
}
object CheckinArgument {
  
  inline def apply(
    MajorVersion: Boolean,
    MimeType: String,
    NewTitle: String,
    SourceURL: String,
    TargetURL: String,
    VersionComment: String
  ): CheckinArgument = {
    val __obj = js.Dynamic.literal(MajorVersion = MajorVersion.asInstanceOf[js.Any], MimeType = MimeType.asInstanceOf[js.Any], NewTitle = NewTitle.asInstanceOf[js.Any], SourceURL = SourceURL.asInstanceOf[js.Any], TargetURL = TargetURL.asInstanceOf[js.Any], VersionComment = VersionComment.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckinArgument]
  }
  
  extension [Self <: CheckinArgument](x: Self) {
    
    inline def setMajorVersion(value: Boolean): Self = StObject.set(x, "MajorVersion", value.asInstanceOf[js.Any])
    
    inline def setMimeType(value: String): Self = StObject.set(x, "MimeType", value.asInstanceOf[js.Any])
    
    inline def setNewTitle(value: String): Self = StObject.set(x, "NewTitle", value.asInstanceOf[js.Any])
    
    inline def setSourceURL(value: String): Self = StObject.set(x, "SourceURL", value.asInstanceOf[js.Any])
    
    inline def setTargetURL(value: String): Self = StObject.set(x, "TargetURL", value.asInstanceOf[js.Any])
    
    inline def setVersionComment(value: String): Self = StObject.set(x, "VersionComment", value.asInstanceOf[js.Any])
  }
}
