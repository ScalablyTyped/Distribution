package typings.activexLibreoffice.com_.sun.star.util

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents the information that describes a revision of something. */
trait RevisionTag extends StObject {
  
  /** contains an identifier for the author that created the revision( can be empty ) */
  var Author: String
  
  /** contains a comment that the author has left for this revision ( can be empty ) */
  var Comment: String
  
  /**
    * contains a unique identifier for the revision and must not be empty
    *
    * This identifier can have any form. It can be something like "1.2.3" or "Version 1" etc. It depends on the revision control system how it names the
    * revisions.
    */
  var Identifier: String
  
  /** contains the time when the revision was created ( can be invalid ) */
  var TimeStamp: DateTime
}
object RevisionTag {
  
  inline def apply(Author: String, Comment: String, Identifier: String, TimeStamp: DateTime): RevisionTag = {
    val __obj = js.Dynamic.literal(Author = Author.asInstanceOf[js.Any], Comment = Comment.asInstanceOf[js.Any], Identifier = Identifier.asInstanceOf[js.Any], TimeStamp = TimeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevisionTag]
  }
  
  extension [Self <: RevisionTag](x: Self) {
    
    inline def setAuthor(value: String): Self = StObject.set(x, "Author", value.asInstanceOf[js.Any])
    
    inline def setComment(value: String): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setTimeStamp(value: DateTime): Self = StObject.set(x, "TimeStamp", value.asInstanceOf[js.Any])
  }
}
