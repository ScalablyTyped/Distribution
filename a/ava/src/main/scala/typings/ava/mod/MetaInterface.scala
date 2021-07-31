package typings.ava.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetaInterface extends StObject {
  
  /** Path to the test file being executed. */
  var file: String
  
  /** Directory where snapshots are stored. */
  var snapshotDirectory: String
}
object MetaInterface {
  
  @scala.inline
  def apply(file: String, snapshotDirectory: String): MetaInterface = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], snapshotDirectory = snapshotDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaInterface]
  }
  
  @scala.inline
  implicit class MetaInterfaceMutableBuilder[Self <: MetaInterface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotDirectory(value: String): Self = StObject.set(x, "snapshotDirectory", value.asInstanceOf[js.Any])
  }
}
