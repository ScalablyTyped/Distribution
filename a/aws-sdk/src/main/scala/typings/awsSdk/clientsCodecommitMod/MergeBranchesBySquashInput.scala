package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergeBranchesBySquashInput extends StObject {
  
  /**
    * The name of the author who created the commit. This information is used as both the author and committer for the commit.
    */
  var authorName: js.UndefOr[Name] = js.undefined
  
  /**
    * The commit message for the merge.
    */
  var commitMessage: js.UndefOr[Message] = js.undefined
  
  /**
    * The level of conflict detail to use. If unspecified, the default FILE_LEVEL is used, which returns a not-mergeable result if the same file has differences in both branches. If LINE_LEVEL is specified, a conflict is considered not mergeable if the same file in both branches has differences on the same line.
    */
  var conflictDetailLevel: js.UndefOr[ConflictDetailLevelTypeEnum] = js.undefined
  
  /**
    * If AUTOMERGE is the conflict resolution strategy, a list of inputs to use when resolving conflicts during a merge.
    */
  var conflictResolution: js.UndefOr[ConflictResolution] = js.undefined
  
  /**
    * Specifies which branch to use when resolving conflicts, or whether to attempt automatically merging two versions of a file. The default is NONE, which requires any conflicts to be resolved manually before the merge operation is successful.
    */
  var conflictResolutionStrategy: js.UndefOr[ConflictResolutionStrategyTypeEnum] = js.undefined
  
  /**
    * The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch name or a full commit ID).
    */
  var destinationCommitSpecifier: CommitName
  
  /**
    * The email address of the person merging the branches. This information is used in the commit information for the merge.
    */
  var email: js.UndefOr[Email] = js.undefined
  
  /**
    * If the commit contains deletions, whether to keep a folder or folder structure if the changes leave the folders empty. If this is specified as true, a .gitkeep file is created for empty folders. The default is false.
    */
  var keepEmptyFolders: js.UndefOr[KeepEmptyFolders] = js.undefined
  
  /**
    * The name of the repository where you want to merge two branches.
    */
  var repositoryName: RepositoryName
  
  /**
    * The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch name or a full commit ID).
    */
  var sourceCommitSpecifier: CommitName
  
  /**
    * The branch where the merge is applied. 
    */
  var targetBranch: js.UndefOr[BranchName] = js.undefined
}
object MergeBranchesBySquashInput {
  
  inline def apply(
    destinationCommitSpecifier: CommitName,
    repositoryName: RepositoryName,
    sourceCommitSpecifier: CommitName
  ): MergeBranchesBySquashInput = {
    val __obj = js.Dynamic.literal(destinationCommitSpecifier = destinationCommitSpecifier.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any], sourceCommitSpecifier = sourceCommitSpecifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeBranchesBySquashInput]
  }
  
  extension [Self <: MergeBranchesBySquashInput](x: Self) {
    
    inline def setAuthorName(value: Name): Self = StObject.set(x, "authorName", value.asInstanceOf[js.Any])
    
    inline def setAuthorNameUndefined: Self = StObject.set(x, "authorName", js.undefined)
    
    inline def setCommitMessage(value: Message): Self = StObject.set(x, "commitMessage", value.asInstanceOf[js.Any])
    
    inline def setCommitMessageUndefined: Self = StObject.set(x, "commitMessage", js.undefined)
    
    inline def setConflictDetailLevel(value: ConflictDetailLevelTypeEnum): Self = StObject.set(x, "conflictDetailLevel", value.asInstanceOf[js.Any])
    
    inline def setConflictDetailLevelUndefined: Self = StObject.set(x, "conflictDetailLevel", js.undefined)
    
    inline def setConflictResolution(value: ConflictResolution): Self = StObject.set(x, "conflictResolution", value.asInstanceOf[js.Any])
    
    inline def setConflictResolutionStrategy(value: ConflictResolutionStrategyTypeEnum): Self = StObject.set(x, "conflictResolutionStrategy", value.asInstanceOf[js.Any])
    
    inline def setConflictResolutionStrategyUndefined: Self = StObject.set(x, "conflictResolutionStrategy", js.undefined)
    
    inline def setConflictResolutionUndefined: Self = StObject.set(x, "conflictResolution", js.undefined)
    
    inline def setDestinationCommitSpecifier(value: CommitName): Self = StObject.set(x, "destinationCommitSpecifier", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: Email): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setKeepEmptyFolders(value: KeepEmptyFolders): Self = StObject.set(x, "keepEmptyFolders", value.asInstanceOf[js.Any])
    
    inline def setKeepEmptyFoldersUndefined: Self = StObject.set(x, "keepEmptyFolders", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setSourceCommitSpecifier(value: CommitName): Self = StObject.set(x, "sourceCommitSpecifier", value.asInstanceOf[js.Any])
    
    inline def setTargetBranch(value: BranchName): Self = StObject.set(x, "targetBranch", value.asInstanceOf[js.Any])
    
    inline def setTargetBranchUndefined: Self = StObject.set(x, "targetBranch", js.undefined)
  }
}
