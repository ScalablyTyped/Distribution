package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValues
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldmaster {
  
  /**
    * specifies service of a {@link Bibliography} field master.
    * @see com.sun.star.text.TextField
    */
  trait Bibliography
    extends StObject
       with TextFieldMaster {
    
    /** determines the closing bracket used to display the bibliography text fields. */
    var BracketAfter: String
    
    /** determines the opening bracket used to display the bibliography text fields. */
    var BracketBefore: String
    
    /** determines whether the bibliography text fields are numbered. If `FALSE` the short name of the bibliography entry is displayed instead. */
    var IsNumberEntries: Boolean
    
    /**
      * determines whether the bibliography entries in a bibliography index are sorted by the document position. If `FALSE` the SortKey property determines
      * the sorting of the entries.
      */
    var IsSortByPosition: Boolean
    
    /** contains the locale of the field master */
    var Locale: typings.activexLibreoffice.com_.sun.star.lang.Locale
    
    /** contains the name of the sort algorithm that is used to sort the text fields. */
    var SortAlgorithm: String
    
    /**
      * determines the sorting of the bibliography entries in a bibliography index. This property is used if the property IsSortByPosition is not set. Each
      * contained element of the sequence is a sequence of the following two properties:
      *
      * [property] short SortKey;
      *
      *
      *
      * Determines the bibliography field that is used to sort by.
      *
      *
      *
      * [property] boolean IsSortAscending;
      *
      *
      *
      * Determines whether the sorting is ascending or descending. It uses the type {@link com.sun.star.text.BibliographyDataField}
      */
    var SortKeys: SafeArray[PropertyValues]
  }
  object Bibliography {
    
    @scala.inline
    def apply(
      BracketAfter: String,
      BracketBefore: String,
      DependentTextFields: SafeArray[XDependentTextField],
      InstanceName: String,
      IsNumberEntries: Boolean,
      IsSortByPosition: Boolean,
      Locale: Locale,
      Name: String,
      PropertySetInfo: XPropertySetInfo,
      SortAlgorithm: String,
      SortKeys: SafeArray[PropertyValues],
      acquire: () => Unit,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      getPropertySetInfo: () => XPropertySetInfo,
      getPropertyValue: String => js.Any,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      setPropertyValue: (String, js.Any) => Unit
    ): typings.activexLibreoffice.com_.sun.star.text.fieldmaster.Bibliography = {
      val __obj = js.Dynamic.literal(BracketAfter = BracketAfter.asInstanceOf[js.Any], BracketBefore = BracketBefore.asInstanceOf[js.Any], DependentTextFields = DependentTextFields.asInstanceOf[js.Any], InstanceName = InstanceName.asInstanceOf[js.Any], IsNumberEntries = IsNumberEntries.asInstanceOf[js.Any], IsSortByPosition = IsSortByPosition.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], SortAlgorithm = SortAlgorithm.asInstanceOf[js.Any], SortKeys = SortKeys.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
      __obj.asInstanceOf[typings.activexLibreoffice.com_.sun.star.text.fieldmaster.Bibliography]
    }
    
    @scala.inline
    implicit class BibliographyMutableBuilder[Self <: typings.activexLibreoffice.com_.sun.star.text.fieldmaster.Bibliography] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBracketAfter(value: String): Self = StObject.set(x, "BracketAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBracketBefore(value: String): Self = StObject.set(x, "BracketBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsNumberEntries(value: Boolean): Self = StObject.set(x, "IsNumberEntries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSortByPosition(value: Boolean): Self = StObject.set(x, "IsSortByPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: Locale): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortAlgorithm(value: String): Self = StObject.set(x, "SortAlgorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortKeys(value: SafeArray[PropertyValues]): Self = StObject.set(x, "SortKeys", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * specifies service of a {@link DDE} field master.
    * @see com.sun.star.text.TextField
    */
  trait DDE
    extends StObject
       with TextFieldMaster {
    
    /** contains the content. */
    var Content: String
    
    /** contains the element string of the {@link DDE} command. */
    var DDECommandElement: String
    
    /** contains the file string of the {@link DDE} command. */
    var DDECommandFile: String
    
    /** contains the type string of the {@link DDE} command. */
    var DDECommandType: String
    
    /** determines whether {@link DDE} link is updated automatically. */
    var IsAutomaticUpdate: Boolean
  }
  object DDE {
    
    @scala.inline
    def apply(
      Content: String,
      DDECommandElement: String,
      DDECommandFile: String,
      DDECommandType: String,
      DependentTextFields: SafeArray[XDependentTextField],
      InstanceName: String,
      IsAutomaticUpdate: Boolean,
      Name: String,
      PropertySetInfo: XPropertySetInfo,
      acquire: () => Unit,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      getPropertySetInfo: () => XPropertySetInfo,
      getPropertyValue: String => js.Any,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      setPropertyValue: (String, js.Any) => Unit
    ): DDE = {
      val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], DDECommandElement = DDECommandElement.asInstanceOf[js.Any], DDECommandFile = DDECommandFile.asInstanceOf[js.Any], DDECommandType = DDECommandType.asInstanceOf[js.Any], DependentTextFields = DependentTextFields.asInstanceOf[js.Any], InstanceName = InstanceName.asInstanceOf[js.Any], IsAutomaticUpdate = IsAutomaticUpdate.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
      __obj.asInstanceOf[DDE]
    }
    
    @scala.inline
    implicit class DDEMutableBuilder[Self <: DDE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDDECommandElement(value: String): Self = StObject.set(x, "DDECommandElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDDECommandFile(value: String): Self = StObject.set(x, "DDECommandFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDDECommandType(value: String): Self = StObject.set(x, "DDECommandType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAutomaticUpdate(value: Boolean): Self = StObject.set(x, "IsAutomaticUpdate", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * specifies service of a {@link Database} field master.
    * @see com.sun.star.text.TextField Only one of the properties {@link DataBaseName} , {@link DataBaseURL} and {@link DataBaseResource} should be set. If
    */
  trait Database
    extends StObject
       with TextFieldMaster {
    
    /** contains the CommandType this can be the name of a data base table, a data query or a statement. (0 = table, 1 = query, 2 = statement) */
    var CommandType: Double
    
    /** specifies the database name. */
    var DataBaseName: String
    
    /**
      * indicates a connection URL, which locates a database driver.
      * @since OOo 2.0
      */
    var DataBaseResource: String
    
    /**
      * indicates the URL of a database file.
      * @since OOo 2.0
      */
    var DataBaseURL: String
    
    /** contains the name of the data base table. */
    var DataColumnName: String
    
    /** contains the command string. Depending on the CommandType property this can be the name of a data base table, a data query or a statement. */
    var DataTableName: String
  }
  object Database {
    
    @scala.inline
    def apply(
      CommandType: Double,
      DataBaseName: String,
      DataBaseResource: String,
      DataBaseURL: String,
      DataColumnName: String,
      DataTableName: String,
      DependentTextFields: SafeArray[XDependentTextField],
      InstanceName: String,
      Name: String,
      PropertySetInfo: XPropertySetInfo,
      acquire: () => Unit,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      getPropertySetInfo: () => XPropertySetInfo,
      getPropertyValue: String => js.Any,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      setPropertyValue: (String, js.Any) => Unit
    ): Database = {
      val __obj = js.Dynamic.literal(CommandType = CommandType.asInstanceOf[js.Any], DataBaseName = DataBaseName.asInstanceOf[js.Any], DataBaseResource = DataBaseResource.asInstanceOf[js.Any], DataBaseURL = DataBaseURL.asInstanceOf[js.Any], DataColumnName = DataColumnName.asInstanceOf[js.Any], DataTableName = DataTableName.asInstanceOf[js.Any], DependentTextFields = DependentTextFields.asInstanceOf[js.Any], InstanceName = InstanceName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
      __obj.asInstanceOf[Database]
    }
    
    @scala.inline
    implicit class DatabaseMutableBuilder[Self <: Database] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommandType(value: Double): Self = StObject.set(x, "CommandType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataBaseName(value: String): Self = StObject.set(x, "DataBaseName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataBaseResource(value: String): Self = StObject.set(x, "DataBaseResource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataBaseURL(value: String): Self = StObject.set(x, "DataBaseURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataColumnName(value: String): Self = StObject.set(x, "DataColumnName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataTableName(value: String): Self = StObject.set(x, "DataTableName", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Specifies the service of a set expression field master.
    * @see com.sun.star.text.TextFieldMaster
    */
  trait SetExpression
    extends StObject
       with TextFieldMaster {
    
    /** determines the number of the chapter. This values is used if the field master is set as number sequence. */
    var ChapterNumberingLevel: Double
    
    /** determines the numbering separator string if the field master is set as number sequence. */
    var NumberingSeparator: String
    
    /** determines the type of the field as {@link com.sun.star.text.SetVariableType} */
    var SubType: Double
  }
  object SetExpression {
    
    @scala.inline
    def apply(
      ChapterNumberingLevel: Double,
      DependentTextFields: SafeArray[XDependentTextField],
      InstanceName: String,
      Name: String,
      NumberingSeparator: String,
      PropertySetInfo: XPropertySetInfo,
      SubType: Double,
      acquire: () => Unit,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      getPropertySetInfo: () => XPropertySetInfo,
      getPropertyValue: String => js.Any,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      setPropertyValue: (String, js.Any) => Unit
    ): SetExpression = {
      val __obj = js.Dynamic.literal(ChapterNumberingLevel = ChapterNumberingLevel.asInstanceOf[js.Any], DependentTextFields = DependentTextFields.asInstanceOf[js.Any], InstanceName = InstanceName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NumberingSeparator = NumberingSeparator.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], SubType = SubType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
      __obj.asInstanceOf[SetExpression]
    }
    
    @scala.inline
    implicit class SetExpressionMutableBuilder[Self <: SetExpression] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChapterNumberingLevel(value: Double): Self = StObject.set(x, "ChapterNumberingLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberingSeparator(value: String): Self = StObject.set(x, "NumberingSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubType(value: Double): Self = StObject.set(x, "SubType", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Specifies the service of a user field master.
    * @see com.sun.star.text.TextFieldMaster
    */
  trait User
    extends StObject
       with TextFieldMaster {
    
    /** contains the content. */
    var Content: String
    
    /** determines whether the field contains an expression. */
    var IsExpression: Boolean
    
    /** contains the value. */
    var Value: Double
  }
  object User {
    
    @scala.inline
    def apply(
      Content: String,
      DependentTextFields: SafeArray[XDependentTextField],
      InstanceName: String,
      IsExpression: Boolean,
      Name: String,
      PropertySetInfo: XPropertySetInfo,
      Value: Double,
      acquire: () => Unit,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      getPropertySetInfo: () => XPropertySetInfo,
      getPropertyValue: String => js.Any,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      setPropertyValue: (String, js.Any) => Unit
    ): User = {
      val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], DependentTextFields = DependentTextFields.asInstanceOf[js.Any], InstanceName = InstanceName.asInstanceOf[js.Any], IsExpression = IsExpression.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
      __obj.asInstanceOf[User]
    }
    
    @scala.inline
    implicit class UserMutableBuilder[Self <: User] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsExpression(value: Boolean): Self = StObject.set(x, "IsExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    }
  }
}
