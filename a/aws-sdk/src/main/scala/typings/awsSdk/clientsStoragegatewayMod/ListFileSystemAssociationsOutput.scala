package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFileSystemAssociationsOutput extends StObject {
  
  /**
    * An array of information about the Amazon FSx gateway's file system associations.
    */
  var FileSystemAssociationSummaryList: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.FileSystemAssociationSummaryList] = js.undefined
  
  /**
    * If the request includes Marker, the response returns that value in this field.
    */
  var Marker: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.Marker] = js.undefined
  
  /**
    * If a value is present, there are more file system associations to return. In a subsequent request, use NextMarker as the value for Marker to retrieve the next set of file system associations.
    */
  var NextMarker: js.UndefOr[Marker] = js.undefined
}
object ListFileSystemAssociationsOutput {
  
  inline def apply(): ListFileSystemAssociationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFileSystemAssociationsOutput]
  }
  
  extension [Self <: ListFileSystemAssociationsOutput](x: Self) {
    
    inline def setFileSystemAssociationSummaryList(value: FileSystemAssociationSummaryList): Self = StObject.set(x, "FileSystemAssociationSummaryList", value.asInstanceOf[js.Any])
    
    inline def setFileSystemAssociationSummaryListUndefined: Self = StObject.set(x, "FileSystemAssociationSummaryList", js.undefined)
    
    inline def setFileSystemAssociationSummaryListVarargs(value: FileSystemAssociationSummary*): Self = StObject.set(x, "FileSystemAssociationSummaryList", js.Array(value*))
    
    inline def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setNextMarker(value: Marker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
