package typings.activexDao

import typings.activexDao.DAO.Documents
import typings.activexDao.DAO.Fields
import typings.activexDao.DAO.Properties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object DAO {
    
    @JSGlobal("DAO.ComplexType")
    @js.native
    /* private */ open class ComplexType ()
      extends StObject
         with typings.activexDao.DAO.ComplexType {
      
      /* private */ /* CompleteClass */
      @JSName("DAO.ComplexType_typekey")
      var DAODotComplexType_typekey: typings.activexDao.DAO.ComplexType = js.native
      
      /* CompleteClass */
      override def Fields(Item: String): typings.activexDao.DAO.Field = js.native
      /* CompleteClass */
      override def Fields(Item: Double): typings.activexDao.DAO.Field = js.native
      /* CompleteClass */
      @JSName("Fields")
      override val Fields_Original: Fields = js.native
    }
    
    @JSGlobal("DAO.Connection")
    @js.native
    /* private */ open class Connection ()
      extends StObject
         with typings.activexDao.DAO.Connection
    
    @JSGlobal("DAO.Container")
    @js.native
    /* private */ open class Container ()
      extends StObject
         with typings.activexDao.DAO.Container {
      
      /* CompleteClass */
      override val AllPermissions: Double = js.native
      
      /* private */ /* CompleteClass */
      @JSName("DAO.Container_typekey")
      var DAODotContainer_typekey: typings.activexDao.DAO.Container = js.native
      
      /* CompleteClass */
      override def Documents(Item: String): typings.activexDao.DAO.Document = js.native
      /* CompleteClass */
      override def Documents(Item: Double): typings.activexDao.DAO.Document = js.native
      /* CompleteClass */
      @JSName("Documents")
      override val Documents_Original: Documents = js.native
      
      /* CompleteClass */
      var Inherit: Boolean = js.native
      
      /* CompleteClass */
      override val Name: String = js.native
      
      /* CompleteClass */
      var Owner: String = js.native
      
      /* CompleteClass */
      var Permissions: Double = js.native
      
      /* CompleteClass */
      override def Properties(Item: String): typings.activexDao.DAO.Property = js.native
      /* CompleteClass */
      override def Properties(Item: Double): typings.activexDao.DAO.Property = js.native
      /* CompleteClass */
      @JSName("Properties")
      override val Properties_Original: Properties = js.native
      
      /* CompleteClass */
      var UserName: String = js.native
    }
    
    @JSGlobal("DAO.DBEngine")
    @js.native
    /* private */ open class DBEngine ()
      extends StObject
         with typings.activexDao.DAO.DBEngine
    
    @JSGlobal("DAO.Database")
    @js.native
    /* private */ open class Database ()
      extends StObject
         with typings.activexDao.DAO.Database
    
    @JSGlobal("DAO.Document")
    @js.native
    /* private */ open class Document ()
      extends StObject
         with typings.activexDao.DAO.Document
    
    @JSGlobal("DAO.Error")
    @js.native
    /* private */ open class Error ()
      extends StObject
         with typings.activexDao.DAO.Error {
      
      /* private */ /* CompleteClass */
      @JSName("DAO.Error_typekey")
      var DAODotError_typekey: typings.activexDao.DAO.Error = js.native
      
      /* CompleteClass */
      override val Description: String = js.native
      
      /* CompleteClass */
      override val HelpContext: Double = js.native
      
      /* CompleteClass */
      override val HelpFile: String = js.native
      
      /* CompleteClass */
      override val Number: Double = js.native
      
      /* CompleteClass */
      override val Source: String = js.native
    }
    
    @JSGlobal("DAO.Field")
    @js.native
    /* private */ open class Field ()
      extends StObject
         with typings.activexDao.DAO.Field
    
    @JSGlobal("DAO.Group")
    @js.native
    /* private */ open class Group ()
      extends StObject
         with typings.activexDao.DAO.Group
    
    @JSGlobal("DAO.Index")
    @js.native
    /* private */ open class Index ()
      extends StObject
         with typings.activexDao.DAO.Index
    
    @JSGlobal("DAO.Parameter")
    @js.native
    /* private */ open class Parameter ()
      extends StObject
         with typings.activexDao.DAO.Parameter {
      
      /* private */ /* CompleteClass */
      @JSName("DAO.Parameter_typekey")
      var DAODotParameter_typekey: typings.activexDao.DAO.Parameter = js.native
      
      /* CompleteClass */
      var Direction: Double = js.native
      
      /* CompleteClass */
      override val Name: String = js.native
      
      /* CompleteClass */
      override def Properties(Item: String): typings.activexDao.DAO.Property = js.native
      /* CompleteClass */
      override def Properties(Item: Double): typings.activexDao.DAO.Property = js.native
      /* CompleteClass */
      @JSName("Properties")
      override val Properties_Original: Properties = js.native
      
      /* CompleteClass */
      var Type: Double = js.native
      
      /* CompleteClass */
      var Value: Any = js.native
    }
    
    @JSGlobal("DAO.Property")
    @js.native
    /* private */ open class Property ()
      extends StObject
         with typings.activexDao.DAO.Property {
      
      /* private */ /* CompleteClass */
      @JSName("DAO.Property_typekey")
      var DAODotProperty_typekey: typings.activexDao.DAO.Property = js.native
      
      /* CompleteClass */
      override val Inherited: Boolean = js.native
      
      /* CompleteClass */
      var Name: String = js.native
      
      /* CompleteClass */
      override def Properties(Item: String): typings.activexDao.DAO.Property = js.native
      /* CompleteClass */
      override def Properties(Item: Double): typings.activexDao.DAO.Property = js.native
      /* CompleteClass */
      @JSName("Properties")
      override val Properties_Original: Properties = js.native
      
      /* CompleteClass */
      var Type: Double = js.native
      
      /* CompleteClass */
      var Value: Any = js.native
    }
    
    @JSGlobal("DAO.QueryDef")
    @js.native
    /* private */ open class QueryDef ()
      extends StObject
         with typings.activexDao.DAO.QueryDef
    
    @JSGlobal("DAO.Relation")
    @js.native
    /* private */ open class Relation ()
      extends StObject
         with typings.activexDao.DAO.Relation
    
    @JSGlobal("DAO.TableDef")
    @js.native
    /* private */ open class TableDef ()
      extends StObject
         with typings.activexDao.DAO.TableDef
    
    @JSGlobal("DAO.User")
    @js.native
    /* private */ open class User ()
      extends StObject
         with typings.activexDao.DAO.User
    
    @JSGlobal("DAO.Workspace")
    @js.native
    /* private */ open class Workspace ()
      extends StObject
         with typings.activexDao.DAO.Workspace
  }
}
