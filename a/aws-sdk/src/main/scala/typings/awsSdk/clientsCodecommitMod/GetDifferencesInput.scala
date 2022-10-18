package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDifferencesInput extends StObject {
  
  /**
    * A non-zero, non-negative integer used to limit the number of returned results.
    */
  var MaxResults: js.UndefOr[Limit] = js.undefined
  
  /**
    * An enumeration token that, when provided in a request, returns the next batch of the results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsCodecommitMod.NextToken] = js.undefined
  
  /**
    * The branch, tag, HEAD, or other fully qualified reference used to identify a commit.
    */
  var afterCommitSpecifier: CommitName
  
  /**
    * The file path in which to check differences. Limits the results to this path. Can also be used to specify the changed name of a directory or folder, if it has changed. If not specified, differences are shown for all paths.
    */
  var afterPath: js.UndefOr[Path] = js.undefined
  
  /**
    * The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, the full commit ID). Optional. If not specified, all changes before the afterCommitSpecifier value are shown. If you do not use beforeCommitSpecifier in your request, consider limiting the results with maxResults.
    */
  var beforeCommitSpecifier: js.UndefOr[CommitName] = js.undefined
  
  /**
    * The file path in which to check for differences. Limits the results to this path. Can also be used to specify the previous name of a directory or folder. If beforePath and afterPath are not specified, differences are shown for all paths.
    */
  var beforePath: js.UndefOr[Path] = js.undefined
  
  /**
    * The name of the repository where you want to get differences.
    */
  var repositoryName: RepositoryName
}
object GetDifferencesInput {
  
  inline def apply(afterCommitSpecifier: CommitName, repositoryName: RepositoryName): GetDifferencesInput = {
    val __obj = js.Dynamic.literal(afterCommitSpecifier = afterCommitSpecifier.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDifferencesInput]
  }
  
  extension [Self <: GetDifferencesInput](x: Self) {
    
    inline def setAfterCommitSpecifier(value: CommitName): Self = StObject.set(x, "afterCommitSpecifier", value.asInstanceOf[js.Any])
    
    inline def setAfterPath(value: Path): Self = StObject.set(x, "afterPath", value.asInstanceOf[js.Any])
    
    inline def setAfterPathUndefined: Self = StObject.set(x, "afterPath", js.undefined)
    
    inline def setBeforeCommitSpecifier(value: CommitName): Self = StObject.set(x, "beforeCommitSpecifier", value.asInstanceOf[js.Any])
    
    inline def setBeforeCommitSpecifierUndefined: Self = StObject.set(x, "beforeCommitSpecifier", js.undefined)
    
    inline def setBeforePath(value: Path): Self = StObject.set(x, "beforePath", value.asInstanceOf[js.Any])
    
    inline def setBeforePathUndefined: Self = StObject.set(x, "beforePath", js.undefined)
    
    inline def setMaxResults(value: Limit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
