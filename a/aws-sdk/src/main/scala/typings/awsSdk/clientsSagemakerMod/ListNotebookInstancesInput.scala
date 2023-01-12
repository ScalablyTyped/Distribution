package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNotebookInstancesInput extends StObject {
  
  /**
    * A filter that returns only notebook instances with associated with the specified git repository.
    */
  var AdditionalCodeRepositoryEquals: js.UndefOr[CodeRepositoryNameOrUrl] = js.undefined
  
  /**
    * A filter that returns only notebook instances that were created after the specified time (timestamp).
    */
  var CreationTimeAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A filter that returns only notebook instances that were created before the specified time (timestamp). 
    */
  var CreationTimeBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A string in the name or URL of a Git repository associated with this notebook instance. This filter returns only notebook instances associated with a git repository with a name that contains the specified string.
    */
  var DefaultCodeRepositoryContains: js.UndefOr[CodeRepositoryContains] = js.undefined
  
  /**
    * A filter that returns only notebook instances that were modified after the specified time (timestamp).
    */
  var LastModifiedTimeAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A filter that returns only notebook instances that were modified before the specified time (timestamp).
    */
  var LastModifiedTimeBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The maximum number of notebook instances to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MaxResults] = js.undefined
  
  /**
    * A string in the notebook instances' name. This filter returns only notebook instances whose name contains the specified string.
    */
  var NameContains: js.UndefOr[NotebookInstanceNameContains] = js.undefined
  
  /**
    *  If the previous call to the ListNotebookInstances is truncated, the response includes a NextToken. You can use this token in your subsequent ListNotebookInstances request to fetch the next set of notebook instances.   You might specify a filter or a sort order in your request. When response is truncated, you must use the same values for the filer and sort order in the next request.  
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
  
  /**
    * A string in the name of a notebook instances lifecycle configuration associated with this notebook instance. This filter returns only notebook instances associated with a lifecycle configuration with a name that contains the specified string.
    */
  var NotebookInstanceLifecycleConfigNameContains: js.UndefOr[NotebookInstanceLifecycleConfigName] = js.undefined
  
  /**
    * The field to sort results by. The default is Name.
    */
  var SortBy: js.UndefOr[NotebookInstanceSortKey] = js.undefined
  
  /**
    * The sort order for results. 
    */
  var SortOrder: js.UndefOr[NotebookInstanceSortOrder] = js.undefined
  
  /**
    * A filter that returns only notebook instances with the specified status.
    */
  var StatusEquals: js.UndefOr[NotebookInstanceStatus] = js.undefined
}
object ListNotebookInstancesInput {
  
  inline def apply(): ListNotebookInstancesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNotebookInstancesInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListNotebookInstancesInput] (val x: Self) extends AnyVal {
    
    inline def setAdditionalCodeRepositoryEquals(value: CodeRepositoryNameOrUrl): Self = StObject.set(x, "AdditionalCodeRepositoryEquals", value.asInstanceOf[js.Any])
    
    inline def setAdditionalCodeRepositoryEqualsUndefined: Self = StObject.set(x, "AdditionalCodeRepositoryEquals", js.undefined)
    
    inline def setCreationTimeAfter(value: js.Date): Self = StObject.set(x, "CreationTimeAfter", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeAfterUndefined: Self = StObject.set(x, "CreationTimeAfter", js.undefined)
    
    inline def setCreationTimeBefore(value: js.Date): Self = StObject.set(x, "CreationTimeBefore", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeBeforeUndefined: Self = StObject.set(x, "CreationTimeBefore", js.undefined)
    
    inline def setDefaultCodeRepositoryContains(value: CodeRepositoryContains): Self = StObject.set(x, "DefaultCodeRepositoryContains", value.asInstanceOf[js.Any])
    
    inline def setDefaultCodeRepositoryContainsUndefined: Self = StObject.set(x, "DefaultCodeRepositoryContains", js.undefined)
    
    inline def setLastModifiedTimeAfter(value: js.Date): Self = StObject.set(x, "LastModifiedTimeAfter", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeAfterUndefined: Self = StObject.set(x, "LastModifiedTimeAfter", js.undefined)
    
    inline def setLastModifiedTimeBefore(value: js.Date): Self = StObject.set(x, "LastModifiedTimeBefore", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeBeforeUndefined: Self = StObject.set(x, "LastModifiedTimeBefore", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNameContains(value: NotebookInstanceNameContains): Self = StObject.set(x, "NameContains", value.asInstanceOf[js.Any])
    
    inline def setNameContainsUndefined: Self = StObject.set(x, "NameContains", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setNotebookInstanceLifecycleConfigNameContains(value: NotebookInstanceLifecycleConfigName): Self = StObject.set(x, "NotebookInstanceLifecycleConfigNameContains", value.asInstanceOf[js.Any])
    
    inline def setNotebookInstanceLifecycleConfigNameContainsUndefined: Self = StObject.set(x, "NotebookInstanceLifecycleConfigNameContains", js.undefined)
    
    inline def setSortBy(value: NotebookInstanceSortKey): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    inline def setSortOrder(value: NotebookInstanceSortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
    
    inline def setStatusEquals(value: NotebookInstanceStatus): Self = StObject.set(x, "StatusEquals", value.asInstanceOf[js.Any])
    
    inline def setStatusEqualsUndefined: Self = StObject.set(x, "StatusEquals", js.undefined)
  }
}
