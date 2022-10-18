package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostCommentForComparedCommitOutput extends StObject {
  
  /**
    * In the directionality you established, the blob ID of the after blob.
    */
  var afterBlobId: js.UndefOr[ObjectId] = js.undefined
  
  /**
    * In the directionality you established, the full commit ID of the after commit.
    */
  var afterCommitId: js.UndefOr[CommitId] = js.undefined
  
  /**
    * In the directionality you established, the blob ID of the before blob.
    */
  var beforeBlobId: js.UndefOr[ObjectId] = js.undefined
  
  /**
    * In the directionality you established, the full commit ID of the before commit.
    */
  var beforeCommitId: js.UndefOr[CommitId] = js.undefined
  
  /**
    * The content of the comment you posted.
    */
  var comment: js.UndefOr[Comment] = js.undefined
  
  /**
    * The location of the comment in the comparison between the two commits.
    */
  var location: js.UndefOr[Location] = js.undefined
  
  /**
    * The name of the repository where you posted a comment on the comparison between commits.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
}
object PostCommentForComparedCommitOutput {
  
  inline def apply(): PostCommentForComparedCommitOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostCommentForComparedCommitOutput]
  }
  
  extension [Self <: PostCommentForComparedCommitOutput](x: Self) {
    
    inline def setAfterBlobId(value: ObjectId): Self = StObject.set(x, "afterBlobId", value.asInstanceOf[js.Any])
    
    inline def setAfterBlobIdUndefined: Self = StObject.set(x, "afterBlobId", js.undefined)
    
    inline def setAfterCommitId(value: CommitId): Self = StObject.set(x, "afterCommitId", value.asInstanceOf[js.Any])
    
    inline def setAfterCommitIdUndefined: Self = StObject.set(x, "afterCommitId", js.undefined)
    
    inline def setBeforeBlobId(value: ObjectId): Self = StObject.set(x, "beforeBlobId", value.asInstanceOf[js.Any])
    
    inline def setBeforeBlobIdUndefined: Self = StObject.set(x, "beforeBlobId", js.undefined)
    
    inline def setBeforeCommitId(value: CommitId): Self = StObject.set(x, "beforeCommitId", value.asInstanceOf[js.Any])
    
    inline def setBeforeCommitIdUndefined: Self = StObject.set(x, "beforeCommitId", js.undefined)
    
    inline def setComment(value: Comment): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
  }
}
