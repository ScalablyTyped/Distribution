package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentsForComparedCommit extends StObject {
  
  /**
    * The full blob ID of the commit used to establish the after of the comparison.
    */
  var afterBlobId: js.UndefOr[ObjectId] = js.undefined
  
  /**
    * The full commit ID of the commit used to establish the after of the comparison.
    */
  var afterCommitId: js.UndefOr[CommitId] = js.undefined
  
  /**
    * The full blob ID of the commit used to establish the before of the comparison.
    */
  var beforeBlobId: js.UndefOr[ObjectId] = js.undefined
  
  /**
    * The full commit ID of the commit used to establish the before of the comparison.
    */
  var beforeCommitId: js.UndefOr[CommitId] = js.undefined
  
  /**
    * An array of comment objects. Each comment object contains information about a comment on the comparison between commits.
    */
  var comments: js.UndefOr[Comments] = js.undefined
  
  /**
    * Location information about the comment on the comparison, including the file name, line number, and whether the version of the file where the comment was made is BEFORE or AFTER.
    */
  var location: js.UndefOr[Location] = js.undefined
  
  /**
    * The name of the repository that contains the compared commits.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
}
object CommentsForComparedCommit {
  
  inline def apply(): CommentsForComparedCommit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentsForComparedCommit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommentsForComparedCommit] (val x: Self) extends AnyVal {
    
    inline def setAfterBlobId(value: ObjectId): Self = StObject.set(x, "afterBlobId", value.asInstanceOf[js.Any])
    
    inline def setAfterBlobIdUndefined: Self = StObject.set(x, "afterBlobId", js.undefined)
    
    inline def setAfterCommitId(value: CommitId): Self = StObject.set(x, "afterCommitId", value.asInstanceOf[js.Any])
    
    inline def setAfterCommitIdUndefined: Self = StObject.set(x, "afterCommitId", js.undefined)
    
    inline def setBeforeBlobId(value: ObjectId): Self = StObject.set(x, "beforeBlobId", value.asInstanceOf[js.Any])
    
    inline def setBeforeBlobIdUndefined: Self = StObject.set(x, "beforeBlobId", js.undefined)
    
    inline def setBeforeCommitId(value: CommitId): Self = StObject.set(x, "beforeCommitId", value.asInstanceOf[js.Any])
    
    inline def setBeforeCommitIdUndefined: Self = StObject.set(x, "beforeCommitId", js.undefined)
    
    inline def setComments(value: Comments): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: Comment*): Self = StObject.set(x, "comments", js.Array(value*))
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
  }
}
