package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitHubDocumentCrawlProperties extends StObject {
  
  /**
    *  TRUE to index all issues within a repository.
    */
  var CrawlIssue: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  TRUE to index all comments on issues.
    */
  var CrawlIssueComment: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  TRUE to include all comment attachments for issues.
    */
  var CrawlIssueCommentAttachment: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  TRUE to index all pull requests within a repository.
    */
  var CrawlPullRequest: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  TRUE to index all comments on pull requests.
    */
  var CrawlPullRequestComment: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  TRUE to include all comment attachments for pull requests.
    */
  var CrawlPullRequestCommentAttachment: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  TRUE to index all files with a repository.
    */
  var CrawlRepositoryDocuments: js.UndefOr[Boolean] = js.undefined
}
object GitHubDocumentCrawlProperties {
  
  inline def apply(): GitHubDocumentCrawlProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GitHubDocumentCrawlProperties]
  }
  
  extension [Self <: GitHubDocumentCrawlProperties](x: Self) {
    
    inline def setCrawlIssue(value: Boolean): Self = StObject.set(x, "CrawlIssue", value.asInstanceOf[js.Any])
    
    inline def setCrawlIssueComment(value: Boolean): Self = StObject.set(x, "CrawlIssueComment", value.asInstanceOf[js.Any])
    
    inline def setCrawlIssueCommentAttachment(value: Boolean): Self = StObject.set(x, "CrawlIssueCommentAttachment", value.asInstanceOf[js.Any])
    
    inline def setCrawlIssueCommentAttachmentUndefined: Self = StObject.set(x, "CrawlIssueCommentAttachment", js.undefined)
    
    inline def setCrawlIssueCommentUndefined: Self = StObject.set(x, "CrawlIssueComment", js.undefined)
    
    inline def setCrawlIssueUndefined: Self = StObject.set(x, "CrawlIssue", js.undefined)
    
    inline def setCrawlPullRequest(value: Boolean): Self = StObject.set(x, "CrawlPullRequest", value.asInstanceOf[js.Any])
    
    inline def setCrawlPullRequestComment(value: Boolean): Self = StObject.set(x, "CrawlPullRequestComment", value.asInstanceOf[js.Any])
    
    inline def setCrawlPullRequestCommentAttachment(value: Boolean): Self = StObject.set(x, "CrawlPullRequestCommentAttachment", value.asInstanceOf[js.Any])
    
    inline def setCrawlPullRequestCommentAttachmentUndefined: Self = StObject.set(x, "CrawlPullRequestCommentAttachment", js.undefined)
    
    inline def setCrawlPullRequestCommentUndefined: Self = StObject.set(x, "CrawlPullRequestComment", js.undefined)
    
    inline def setCrawlPullRequestUndefined: Self = StObject.set(x, "CrawlPullRequest", js.undefined)
    
    inline def setCrawlRepositoryDocuments(value: Boolean): Self = StObject.set(x, "CrawlRepositoryDocuments", value.asInstanceOf[js.Any])
    
    inline def setCrawlRepositoryDocumentsUndefined: Self = StObject.set(x, "CrawlRepositoryDocuments", js.undefined)
  }
}
