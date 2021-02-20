package typings.activexLibreoffice.com_.sun.star.sheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a description of how data from an external database is imported.
  * @see com.sun.star.sheet.XDatabaseRange
  */
@js.native
trait DatabaseImportDescriptor extends StObject {
  
  /**
    * indicates a connection URL, which locates a database driver.
    * @since OOo 2.0
    */
  var ConnectionResource: String = js.native
  
  /** specifies the name of the database from which data is imported. */
  var DatabaseName: String = js.native
  
  /**
    * specifies whether the SQL statement is given directly to the database or is parsed before.
    * @since OOo 2.0
    */
  var IsNative: Boolean = js.native
  
  /**
    * specifies the table, query, or statement from which data is imported.
    *
    * The meaning of this is determined by the {@link DatabaseImportDescriptor.SourceType} attribute.
    */
  var SourceObject: String = js.native
  
  /** enables importing and specifies from what type of source data is imported. */
  var SourceType: DataImportMode = js.native
}
object DatabaseImportDescriptor {
  
  @scala.inline
  def apply(
    ConnectionResource: String,
    DatabaseName: String,
    IsNative: Boolean,
    SourceObject: String,
    SourceType: DataImportMode
  ): DatabaseImportDescriptor = {
    val __obj = js.Dynamic.literal(ConnectionResource = ConnectionResource.asInstanceOf[js.Any], DatabaseName = DatabaseName.asInstanceOf[js.Any], IsNative = IsNative.asInstanceOf[js.Any], SourceObject = SourceObject.asInstanceOf[js.Any], SourceType = SourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseImportDescriptor]
  }
  
  @scala.inline
  implicit class DatabaseImportDescriptorMutableBuilder[Self <: DatabaseImportDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionResource(value: String): Self = StObject.set(x, "ConnectionResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseName(value: String): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNative(value: Boolean): Self = StObject.set(x, "IsNative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceObject(value: String): Self = StObject.set(x, "SourceObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceType(value: DataImportMode): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
  }
}
