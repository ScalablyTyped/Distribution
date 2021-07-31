package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VersionUpgradeEventObject extends StObject {
  
  val DocumentVersion: String
  
  @JSName("InfoPath.VersionUpgradeEventObject_typekey")
  var InfoPathDotVersionUpgradeEventObject_typekey: VersionUpgradeEventObject
  
  var ReturnStatus: Boolean
  
  val SolutionVersion: String
  
  val XDocument: _XDocument
}
object VersionUpgradeEventObject {
  
  @scala.inline
  def apply(
    DocumentVersion: String,
    InfoPathDotVersionUpgradeEventObject_typekey: VersionUpgradeEventObject,
    ReturnStatus: Boolean,
    SolutionVersion: String,
    XDocument: _XDocument
  ): VersionUpgradeEventObject = {
    val __obj = js.Dynamic.literal(DocumentVersion = DocumentVersion.asInstanceOf[js.Any], ReturnStatus = ReturnStatus.asInstanceOf[js.Any], SolutionVersion = SolutionVersion.asInstanceOf[js.Any], XDocument = XDocument.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.VersionUpgradeEventObject_typekey")(InfoPathDotVersionUpgradeEventObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionUpgradeEventObject]
  }
  
  @scala.inline
  implicit class VersionUpgradeEventObjectMutableBuilder[Self <: VersionUpgradeEventObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentVersion(value: String): Self = StObject.set(x, "DocumentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoPathDotVersionUpgradeEventObject_typekey(value: VersionUpgradeEventObject): Self = StObject.set(x, "InfoPath.VersionUpgradeEventObject_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnStatus(value: Boolean): Self = StObject.set(x, "ReturnStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolutionVersion(value: String): Self = StObject.set(x, "SolutionVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXDocument(value: _XDocument): Self = StObject.set(x, "XDocument", value.asInstanceOf[js.Any])
  }
}
