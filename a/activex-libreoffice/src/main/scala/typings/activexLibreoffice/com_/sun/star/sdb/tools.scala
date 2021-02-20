package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.activexLibreofficeNumbers.`3`
import typings.activexLibreoffice.activexLibreofficeNumbers.`4`
import typings.activexLibreoffice.activexLibreofficeNumbers.`5`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XInitialization
import typings.activexLibreoffice.com_.sun.star.sdbc.XConnection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tools {
  
  object CompositionType {
    
    /* Rewritten from type alias, can be one of: 
      - typings.activexLibreoffice.activexLibreofficeNumbers.`5`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`4`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
    */
    trait Constants extends StObject
    object Constants {
      
      @scala.inline
      def Complete: `5` = 5.asInstanceOf[`5`]
      
      @scala.inline
      def ForDataManipulation: `2` = 2.asInstanceOf[`2`]
      
      @scala.inline
      def ForIndexDefinitions: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def ForPrivilegeDefinitions: `4` = 4.asInstanceOf[`4`]
      
      @scala.inline
      def ForProcedureCalls: `3` = 3.asInstanceOf[`3`]
      
      @scala.inline
      def ForTableDefinitions: `0` = 0.asInstanceOf[`0`]
    }
  }
  
  /** @since LibreOffice 4.1 */
  @js.native
  trait ConnectionTools extends XConnectionTools {
    
    def createWithConnection(Connection: XConnection): Unit = js.native
  }
  object ConnectionTools {
    
    @scala.inline
    def apply(
      DataSourceMetaData: XDataSourceMetaData,
      ObjectNames: XObjectNames,
      createTableName: () => XTableName,
      createWithConnection: XConnection => Unit,
      getComposer: (Double, String) => XSingleSelectQueryComposer,
      getDataSourceMetaData: () => XDataSourceMetaData,
      getFieldsByCommandDescriptor: (Double, String, js.Array[XComponent]) => XNameAccess,
      getObjectNames: () => XObjectNames
    ): ConnectionTools = {
      val __obj = js.Dynamic.literal(DataSourceMetaData = DataSourceMetaData.asInstanceOf[js.Any], ObjectNames = ObjectNames.asInstanceOf[js.Any], createTableName = js.Any.fromFunction0(createTableName), createWithConnection = js.Any.fromFunction1(createWithConnection), getComposer = js.Any.fromFunction2(getComposer), getDataSourceMetaData = js.Any.fromFunction0(getDataSourceMetaData), getFieldsByCommandDescriptor = js.Any.fromFunction3(getFieldsByCommandDescriptor), getObjectNames = js.Any.fromFunction0(getObjectNames))
      __obj.asInstanceOf[ConnectionTools]
    }
    
    @scala.inline
    implicit class ConnectionToolsMutableBuilder[Self <: ConnectionTools] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateWithConnection(value: XConnection => Unit): Self = StObject.set(x, "createWithConnection", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * allows to access the active connection
    * @see com.sun.star.sdbcx.XConnection
    * @since OOo 3.3
    */
  @js.native
  trait XConnectionSupplier extends XInitialization {
    
    /** returns the source connection. */
    var ActiveConnection: XConnection = js.native
  }
  object XConnectionSupplier {
    
    @scala.inline
    def apply(
      ActiveConnection: XConnection,
      acquire: () => Unit,
      initialize: SeqEquiv[_] => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit
    ): XConnectionSupplier = {
      val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XConnectionSupplier]
    }
    
    @scala.inline
    implicit class XConnectionSupplierMutableBuilder[Self <: XConnectionSupplier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveConnection(value: XConnection): Self = StObject.set(x, "ActiveConnection", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * encapsulates various useful functionality around a {@link com.sun.star.sdb.Connection}
    *
    * Most of the functionality provided here is meaningful only relative to a given database connection. For instance, for quoting table names, you need
    * the meta data instance of the connection. Thus, the entry point for obtaining a {@link XConnectionTools} instance is the {@link
    * com.sun.star.sdb.Connection} service.
    *
    * Note that nearly all functionality provided by this interface is also available by other means, it's only provided here for convenience purposes.
    * @since OOo 2.0.4
    */
  @js.native
  trait XConnectionTools extends StObject {
    
    /** provides access to the application-level data source meta data */
    val DataSourceMetaData: XDataSourceMetaData = js.native
    
    /**
      * returns an instance supporting the {@link XObjectNames} interface, which provides access to functionality around table and query names.
      *
      * The returned object is guaranteed to not be `NULL` .
      */
    val ObjectNames: XObjectNames = js.native
    
    /**
      * creates an instance supporting the {@link XTableName} interface, which can be used to manipulate table names for various purposes.
      *
      * The returned object is guaranteed to not be `NULL` .
      */
    def createTableName(): XTableName = js.native
    
    /**
      * get the composer initialized with a command and command type.
      * @param commandType the type of the object
      * @param command the object. This may be a table name, a query name, or an SQL statement, depending on the value of _nCommandType
      * @returns the composer filled with command and command type.
      */
    def getComposer(commandType: Double, command: String): XSingleSelectQueryComposer = js.native
    
    /** provides access to the application-level data source meta data */
    def getDataSourceMetaData(): XDataSourceMetaData = js.native
    
    /**
      * get fields for a result set given by a "command descriptor"
      *
      * A command descriptor here means: a SDB-level connection ( {@link com.sun.star.sdb.Connection}a string specifying the name of an object relative to the
      * connectiona {@link com.sun.star.sdb.CommandType} value specifying the type of the object
      * @param commandType the type of the object
      * @param command the object. This may be a table name, a query name, or an SQL statement, depending on the value of _nCommandType
      * @param keepFieldsAlive If (and only if) {@link CommandType} is {@link CommandType.COMMAND} , the fields collection which is returned by this function
      * @returns the container of the columns (aka fields) of the object
      */
    def getFieldsByCommandDescriptor(commandType: Double, command: String, keepFieldsAlive: js.Array[XComponent]): XNameAccess = js.native
    
    /**
      * returns an instance supporting the {@link XObjectNames} interface, which provides access to functionality around table and query names.
      *
      * The returned object is guaranteed to not be `NULL` .
      */
    def getObjectNames(): XObjectNames = js.native
  }
  object XConnectionTools {
    
    @scala.inline
    def apply(
      DataSourceMetaData: XDataSourceMetaData,
      ObjectNames: XObjectNames,
      createTableName: () => XTableName,
      getComposer: (Double, String) => XSingleSelectQueryComposer,
      getDataSourceMetaData: () => XDataSourceMetaData,
      getFieldsByCommandDescriptor: (Double, String, js.Array[XComponent]) => XNameAccess,
      getObjectNames: () => XObjectNames
    ): XConnectionTools = {
      val __obj = js.Dynamic.literal(DataSourceMetaData = DataSourceMetaData.asInstanceOf[js.Any], ObjectNames = ObjectNames.asInstanceOf[js.Any], createTableName = js.Any.fromFunction0(createTableName), getComposer = js.Any.fromFunction2(getComposer), getDataSourceMetaData = js.Any.fromFunction0(getDataSourceMetaData), getFieldsByCommandDescriptor = js.Any.fromFunction3(getFieldsByCommandDescriptor), getObjectNames = js.Any.fromFunction0(getObjectNames))
      __obj.asInstanceOf[XConnectionTools]
    }
    
    @scala.inline
    implicit class XConnectionToolsMutableBuilder[Self <: XConnectionTools] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateTableName(value: () => XTableName): Self = StObject.set(x, "createTableName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDataSourceMetaData(value: XDataSourceMetaData): Self = StObject.set(x, "DataSourceMetaData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetComposer(value: (Double, String) => XSingleSelectQueryComposer): Self = StObject.set(x, "getComposer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetDataSourceMetaData(value: () => XDataSourceMetaData): Self = StObject.set(x, "getDataSourceMetaData", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFieldsByCommandDescriptor(value: (Double, String, js.Array[XComponent]) => XNameAccess): Self = StObject.set(x, "getFieldsByCommandDescriptor", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetObjectNames(value: () => XObjectNames): Self = StObject.set(x, "getObjectNames", js.Any.fromFunction0(value))
      
      @scala.inline
      def setObjectNames(value: XObjectNames): Self = StObject.set(x, "ObjectNames", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait XDataSourceMetaData extends StObject {
    
    /** determines whether the data source supports queries in the `FROM` part of a `SELECT` statement. */
    def supportsQueriesInFrom(): Boolean = js.native
  }
  object XDataSourceMetaData {
    
    @scala.inline
    def apply(supportsQueriesInFrom: () => Boolean): XDataSourceMetaData = {
      val __obj = js.Dynamic.literal(supportsQueriesInFrom = js.Any.fromFunction0(supportsQueriesInFrom))
      __obj.asInstanceOf[XDataSourceMetaData]
    }
    
    @scala.inline
    implicit class XDataSourceMetaDataMutableBuilder[Self <: XDataSourceMetaData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSupportsQueriesInFrom(value: () => Boolean): Self = StObject.set(x, "supportsQueriesInFrom", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * allows to alter the indexes of a table.
    * @see com.sun.star.sdb.DataSource.Settings
    * @see com.sun.star.sdbcx.XAppend
    * @see com.sun.star.sdbcx.XDrop
    * @since OOo 3.3
    */
  @js.native
  trait XIndexAlteration extends XConnectionSupplier {
    
    /**
      * creates a new object using the given descriptor and appends it to the related container. ** Note: ** The descriptor will not be changed and can be
      * used again to append another object.
      * @param table the table to be altered
      * @param descriptor the descriptor which should be serve to append a new object
      * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
      */
    def addIndex(table: XPropertySet, descriptor: XPropertySet): Unit = js.native
    
    /**
      * drops an object of the related container identified by its name.
      * @param table the table to be altered
      * @param index the name of the column to be dropped
      * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
      */
    def dropIndex(table: XPropertySet, index: String): Unit = js.native
  }
  object XIndexAlteration {
    
    @scala.inline
    def apply(
      ActiveConnection: XConnection,
      acquire: () => Unit,
      addIndex: (XPropertySet, XPropertySet) => Unit,
      dropIndex: (XPropertySet, String) => Unit,
      initialize: SeqEquiv[_] => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit
    ): XIndexAlteration = {
      val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addIndex = js.Any.fromFunction2(addIndex), dropIndex = js.Any.fromFunction2(dropIndex), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XIndexAlteration]
    }
    
    @scala.inline
    implicit class XIndexAlterationMutableBuilder[Self <: XIndexAlteration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddIndex(value: (XPropertySet, XPropertySet) => Unit): Self = StObject.set(x, "addIndex", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDropIndex(value: (XPropertySet, String) => Unit): Self = StObject.set(x, "dropIndex", js.Any.fromFunction2(value))
    }
  }
  
  /**
    * allows to alter the keys of a table.
    * @see com.sun.star.sdb.DataSource.Settings
    * @see com.sun.star.sdbcx.XAppend
    * @see com.sun.star.sdbcx.XDrop
    * @since OOo 3.3
    */
  @js.native
  trait XKeyAlteration extends XConnectionSupplier {
    
    /**
      * creates a new object using the given descriptor and appends it to the related container. ** Note: ** The descriptor will not be changed and can be
      * used again to append another object.
      * @param table the table to be altered
      * @param descriptor the descriptor which should be serve to append a new object
      * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
      */
    def addKey(table: XPropertySet, descriptor: XPropertySet): Unit = js.native
    
    /**
      * drops an object of the related container identified by its name.
      * @param table the table to be altered
      * @param key the key to be dropped
      * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
      */
    def dropKey(table: XPropertySet, key: XPropertySet): Unit = js.native
  }
  object XKeyAlteration {
    
    @scala.inline
    def apply(
      ActiveConnection: XConnection,
      acquire: () => Unit,
      addKey: (XPropertySet, XPropertySet) => Unit,
      dropKey: (XPropertySet, XPropertySet) => Unit,
      initialize: SeqEquiv[_] => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit
    ): XKeyAlteration = {
      val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addKey = js.Any.fromFunction2(addKey), dropKey = js.Any.fromFunction2(dropKey), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XKeyAlteration]
    }
    
    @scala.inline
    implicit class XKeyAlterationMutableBuilder[Self <: XKeyAlteration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddKey(value: (XPropertySet, XPropertySet) => Unit): Self = StObject.set(x, "addKey", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDropKey(value: (XPropertySet, XPropertySet) => Unit): Self = StObject.set(x, "dropKey", js.Any.fromFunction2(value))
    }
  }
  
  /**
    * encapsulates functionality which you might find useful when writing a database application which deals with query and table names.
    *
    * The most important task fulfilled by this instance is that it hides different naming restrictions from you, which are caused by server-side or client
    * side specialties.
    *
    * For instance, it can validate names against the characters allowed in the object names of a connection. Also, it relieves you from caring whether a
    * database supports queries in a `SELECT` statement's `FROM` part (known as "queries in queries"). In such databases, query and table names share a
    * common namespace, thus they must be unique. Using this interface, you can easily ensure this uniqueness.
    *
    * All of the functionality present in this interface depends on a connection, thus it entry point for obtaining it is a {@link
    * com.sun.star.sdb.Connection} service.
    *
    * The component itself does not have life-time control mechanisms, i.e. you cannot explicitly dispose it ( {@link
    * com.sun.star.lang.XComponent.dispose()} ), and you cannot be notified when it dies. ;  However, if your try to access any of its methods or
    * attributes, after the connection which was used to create it was closed, a {@link com.sun.star.lang.DisposedException} will be thrown.
    * @see XConnectionTools
    * @since OOo 2.0.4
    */
  @js.native
  trait XObjectNames extends StObject {
    
    /**
      * checks whether a given name is allowed for a to-be-created table or query in the database.
      *
      * This method basically does the same checks as {@link isNameUsed()} and {@link isNameValid()} . In case the given name is not allowed, it throws an
      * exception. This error can be presented to the user, to give it a common experience in all cases where they're required to enter an object name.
      * @see isNameUsed
      * @see isNameValid
      * @see com.sun.star.sdb.ErrorMessageDialog
      * @see com.sun.star.sdb.InteractionHandler
      */
    def checkNameForCreate(CommandType: Double, Name: String): Unit = js.native
    
    /**
      * converts the given object name to a name which is valid in the database.
      *
      * The conversion takes place by converting every character which is neither allowed by the SQL-92 standard, nor part of the special characters supported
      * by the database, with an underscore character (_).
      * @see com.sun.star.sdbc.XDatabaseMetaData.getExtraNameCharacters
      */
    def convertToSQLName(Name: String): String = js.native
    
    /**
      * checks whether a given name is used as table respectively query name in the database.
      *
      * If in the database, tables and queries share a common namespace, this will be respected by this function.
      *
      * As before, the information you obtain by calling this method might be obsolete in the very moment you evaluate this, in case another process or thread
      * interferes. However, it's usually sufficiently up-to-date for purpose of using it in a database application driven by user interactions.
      * @param CommandType specifies the {@link com.sun.star.sdb.CommandType} of the object whose name should be checked. Must be either {@link com.sun.star.sdb
      * @param Name specifies the to-be-checked name of the object.
      * @returns `TRUE` if and only if the given name is legitimate as table respectively query name to be used in the database.
      * @see checkNameIsUsed
      * @throws com::sun::star::lang::IllegalArgumentException if {@link CommandType} specifies an invalid command type.
      */
    def isNameUsed(CommandType: Double, Name: String): Boolean = js.native
    
    /**
      * checks whether a given name is valid as table or query name
      *
      * For tables, the name must consist of characters allowed by the SQL-92 standard, plus characters allowed by the connection as extra name characters.
      *
      * For queries, names are nearly arbitrary, except that usual quoting characters must not be part of the name.
      * @see com.sun.star.sdbc.XDatabaseMetaData.getExtraNameCharacters
      */
    def isNameValid(CommandType: Double, Name: String): Boolean = js.native
    
    /**
      * suggests a (unique) table or query name
      *
      * If in the database, tables and queries share a common namespace, this will be respected by this function.
      *
      * Note that in an multi-threaded environment, the name you obtain here is not absolutely guaranteed to be unique. It is unique at the very moment the
      * function returns to you. But already when you evaluate the returned value, it might not be unique anymore, if another process or thread created a
      * query or table with this name.
      *
      * This implies that you cannot rely on the name's uniqueness, but you can use it as first guess to present to the user. In most cases, it will still be
      * sufficient when you are actually creating the table respectively query.
      * @param CommandType specifies the {@link com.sun.star.sdb.CommandType} of the object for which a unique name is to be generated. Must be either {@link co
      * @param BaseName specifies the base of the to-be-created object name. If empty, a default base name will be used.
      * @throws com::sun::star::lang::IllegalArgumentException if {@link CommandType} specifies an invalid command type.
      */
    def suggestName(CommandType: Double, BaseName: String): String = js.native
  }
  object XObjectNames {
    
    @scala.inline
    def apply(
      checkNameForCreate: (Double, String) => Unit,
      convertToSQLName: String => String,
      isNameUsed: (Double, String) => Boolean,
      isNameValid: (Double, String) => Boolean,
      suggestName: (Double, String) => String
    ): XObjectNames = {
      val __obj = js.Dynamic.literal(checkNameForCreate = js.Any.fromFunction2(checkNameForCreate), convertToSQLName = js.Any.fromFunction1(convertToSQLName), isNameUsed = js.Any.fromFunction2(isNameUsed), isNameValid = js.Any.fromFunction2(isNameValid), suggestName = js.Any.fromFunction2(suggestName))
      __obj.asInstanceOf[XObjectNames]
    }
    
    @scala.inline
    implicit class XObjectNamesMutableBuilder[Self <: XObjectNames] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckNameForCreate(value: (Double, String) => Unit): Self = StObject.set(x, "checkNameForCreate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setConvertToSQLName(value: String => String): Self = StObject.set(x, "convertToSQLName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsNameUsed(value: (Double, String) => Boolean): Self = StObject.set(x, "isNameUsed", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsNameValid(value: (Double, String) => Boolean): Self = StObject.set(x, "isNameValid", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSuggestName(value: (Double, String) => String): Self = StObject.set(x, "suggestName", js.Any.fromFunction2(value))
    }
  }
  
  /**
    * allows to alter a table.
    * @see com.sun.star.sdb.DataSource.Settings
    * @see com.sun.star.sdbcx.ColumnDescriptor
    * @see com.sun.star.sdbcx.XAlterTable
    * @see com.sun.star.sdbcx.XAppend
    * @see com.sun.star.sdbcx.XDrop
    * @since OOo 3.3
    */
  @js.native
  trait XTableAlteration extends XConnectionSupplier {
    
    /**
      * creates a new object using the given descriptor and appends it to the related container. ** Note: ** The descriptor will not be changed and can be
      * used again to append another object.
      * @param table the table to be altered
      * @param descriptor the descriptor which should be serve to append a new object
      * @see com.sun.star.sdbcx.XAppend
      * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
      */
    def addColumn(table: XPropertySet, descriptor: XPropertySet): Unit = js.native
    
    /**
      * alter the column defined by name
      * @param table the table to be altered
      * @param columnName the name of the column to be changed
      * @param columnDescriptor the column descriptor with the information of the new column definition
      * @see com.sun.star.sdbcx.XAlterTable
      * @throws com::sun::star::sdbc::SQLException
      */
    def alterColumnByName(table: XPropertySet, columnName: String, columnDescriptor: XPropertySet): Unit = js.native
    
    /**
      * drops an object of the related container identified by its name.
      * @param table the table to be altered
      * @param columnName the name of the column to be dropped
      * @see com.sun.star.sdbcx.XDrop
      * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
      */
    def dropColumn(table: XPropertySet, columnName: String): Unit = js.native
  }
  object XTableAlteration {
    
    @scala.inline
    def apply(
      ActiveConnection: XConnection,
      acquire: () => Unit,
      addColumn: (XPropertySet, XPropertySet) => Unit,
      alterColumnByName: (XPropertySet, String, XPropertySet) => Unit,
      dropColumn: (XPropertySet, String) => Unit,
      initialize: SeqEquiv[_] => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit
    ): XTableAlteration = {
      val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addColumn = js.Any.fromFunction2(addColumn), alterColumnByName = js.Any.fromFunction3(alterColumnByName), dropColumn = js.Any.fromFunction2(dropColumn), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XTableAlteration]
    }
    
    @scala.inline
    implicit class XTableAlterationMutableBuilder[Self <: XTableAlteration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddColumn(value: (XPropertySet, XPropertySet) => Unit): Self = StObject.set(x, "addColumn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAlterColumnByName(value: (XPropertySet, String, XPropertySet) => Unit): Self = StObject.set(x, "alterColumnByName", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDropColumn(value: (XPropertySet, String) => Unit): Self = StObject.set(x, "dropColumn", js.Any.fromFunction2(value))
    }
  }
  
  /**
    * allows to manipulate table names.
    *
    * When, in a database application, dealing with table names, there's many degrees of freedom to deal with. For instance, suppose you want to have the
    * full name of a table object, as it should be used in a `SELECT` statement's `FROM` part. This requires you to evaluate whether or not the table has a
    * catalog and/or schema name, to combine the catalog, the schema, and the basic table name into one name, respecting the database's quoting character,
    * and the order in which all those parts should be combined. Additionally, you have to respect the client-side settings which tell OpenOffice.org to use
    * or not use catalogs and schemas in `SELECT` at all.
    *
    * The {@link XTableName} interface eases this and other, similar tasks around table names.
    *
    * The component itself does not have life-time control mechanisms, i.e. you cannot explicitly dispose it ( {@link
    * com.sun.star.lang.XComponent.dispose()} ), and you cannot be notified when it dies. ;  However, if your try to access any of its methods or
    * attributes, after the connection which was used to create it was closed, a {@link com.sun.star.lang.DisposedException} will be thrown.
    * @see XConnectionTools
    * @see com.sun.star.sdbc.XDatabaseMetaData
    * @see com.sun.star.sdb.DataSource.Settings
    * @since OOo 2.0.4
    */
  @js.native
  trait XTableName extends StObject {
    
    /** denotes the name of the catalog which the table is a part of */
    var CatalogName: String = js.native
    
    /**
      * represents the table name in a form to be used in a `SELECT` statement.
      *
      * On a per-data-source basis, OpenOffice.org allows to override database meta data information in that you can specify to not use catalog and or schema
      * names in `SELECT` statements. Using this attribute, you can generate a table name which respects those settings.
      * @see com.sun.star.sdb.DataSource.Settings
      */
    var NameForSelect: String = js.native
    
    /** denotes the name of the schema which the table is a part of */
    var SchemaName: String = js.native
    
    /**
      * is the {@link com.sun.star.sdb.Table} object specified by the current name.
      *
      * Retrieving this attribute is equivalent to obtaining the tables container from the connection (via {@link com.sun.star.sdbcx.XTablesSupplier} ), and
      * calling its {@link com.sun.star.container.XNameAccess.getByName()} method with the ComposedName.
      * @throws com::sun::star::container::NoSuchElementException if, upon getting the attribute value, the current composed table name represented by this insta
      * @throws com::sun::star::lang::IllegalArgumentException if you try to set an object which does not denote a table from the underlying database.
      */
    var Table: XPropertySet = js.native
    
    /** denotes the mere, unqualified table name, excluding any catalog and schema. */
    var TableName: String = js.native
    
    /**
      * returns the composed table name, including the catalog and schema name, respecting the database's quoting requirements, plus
      * @param Type the type of name composition to be used.
      * @param Quote specifies whether the single parts of the table name should be quoted
      * @see CompositionType
      * @throws com::sun::star::IllegalArgumentException if the given Type does not denote a valid {@link CompositionType}
      */
    def getComposedName(Type: Double, Quote: Boolean): String = js.native
    
    /**
      * sets a new composed table name
      * @param ComposedName specifies the composed table name
      * @param Type specifies the composition type which was used to create the composed table name
      */
    def setComposedName(ComposedName: String, Type: Double): Unit = js.native
  }
  object XTableName {
    
    @scala.inline
    def apply(
      CatalogName: String,
      NameForSelect: String,
      SchemaName: String,
      Table: XPropertySet,
      TableName: String,
      getComposedName: (Double, Boolean) => String,
      setComposedName: (String, Double) => Unit
    ): XTableName = {
      val __obj = js.Dynamic.literal(CatalogName = CatalogName.asInstanceOf[js.Any], NameForSelect = NameForSelect.asInstanceOf[js.Any], SchemaName = SchemaName.asInstanceOf[js.Any], Table = Table.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any], getComposedName = js.Any.fromFunction2(getComposedName), setComposedName = js.Any.fromFunction2(setComposedName))
      __obj.asInstanceOf[XTableName]
    }
    
    @scala.inline
    implicit class XTableNameMutableBuilder[Self <: XTableName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCatalogName(value: String): Self = StObject.set(x, "CatalogName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetComposedName(value: (Double, Boolean) => String): Self = StObject.set(x, "getComposedName", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNameForSelect(value: String): Self = StObject.set(x, "NameForSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaName(value: String): Self = StObject.set(x, "SchemaName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetComposedName(value: (String, Double) => Unit): Self = StObject.set(x, "setComposedName", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTable(value: XPropertySet): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * allows to rename table.
    * @see com.sun.star.sdb.DataSource.Settings
    * @since OOo 3.3
    */
  @js.native
  trait XTableRename extends XConnectionSupplier {
    
    /**
      * rename the given table to the new name
      * @param table the table to be renamed
      * @param newName the new name of the table
      * @throws com::sun::star::sdbc::SQLException
      */
    def rename(table: XPropertySet, newName: String): Unit = js.native
  }
  object XTableRename {
    
    @scala.inline
    def apply(
      ActiveConnection: XConnection,
      acquire: () => Unit,
      initialize: SeqEquiv[_] => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      rename: (XPropertySet, String) => Unit
    ): XTableRename = {
      val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), rename = js.Any.fromFunction2(rename))
      __obj.asInstanceOf[XTableRename]
    }
    
    @scala.inline
    implicit class XTableRenameMutableBuilder[Self <: XTableRename] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRename(value: (XPropertySet, String) => Unit): Self = StObject.set(x, "rename", js.Any.fromFunction2(value))
    }
  }
  
  /**
    * allows to fetch and to change the sql statements of views
    * @see com.sun.star.sdb.DataSource.Settings
    * @see com.sun.star.sdbcx.View
    * @since OOo 3.3
    */
  @js.native
  trait XViewAccess extends XConnectionSupplier {
    
    /**
      * allows to alter the SQL statement of a view
      * @param view the view to be altered
      * @param command the new SQL statement
      * @throws com::sun::star::sdbc::SQLException
      */
    def alterCommand(view: XPropertySet, command: String): Unit = js.native
    
    /**
      * returns the SQL statement of the view
      * @param view the table to be renamed
      * @throws com::sun::star::sdbc::SQLException
      */
    def getCommand(view: XPropertySet): String = js.native
  }
  object XViewAccess {
    
    @scala.inline
    def apply(
      ActiveConnection: XConnection,
      acquire: () => Unit,
      alterCommand: (XPropertySet, String) => Unit,
      getCommand: XPropertySet => String,
      initialize: SeqEquiv[_] => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit
    ): XViewAccess = {
      val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), alterCommand = js.Any.fromFunction2(alterCommand), getCommand = js.Any.fromFunction1(getCommand), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XViewAccess]
    }
    
    @scala.inline
    implicit class XViewAccessMutableBuilder[Self <: XViewAccess] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlterCommand(value: (XPropertySet, String) => Unit): Self = StObject.set(x, "alterCommand", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetCommand(value: XPropertySet => String): Self = StObject.set(x, "getCommand", js.Any.fromFunction1(value))
    }
  }
}
