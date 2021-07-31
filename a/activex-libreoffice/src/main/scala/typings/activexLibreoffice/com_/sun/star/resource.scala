package typings.activexLibreoffice.com_.sun.star

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.embed.XStorage
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import typings.activexLibreoffice.com_.sun.star.uno.RuntimeException
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.XModifyBroadcaster
import typings.activexLibreoffice.com_.sun.star.util.XModifyListener
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resource {
  
  /**
    * is used to signal that a resource is missing.
    * @see XResourceBundle
    */
  type MissingResourceException = RuntimeException
  
  /**
    * describes a {@link XResourceBundleLoader} which provides access to the OpenOffice.org resource files.
    *
    * An OpenOffice.org installation comes with a number of resource files in an proprietary format, located inside the installation's program/resource
    * directory. The {@link OfficeResourceLoader} singleton (available at a component context as value with the key
    * `/singletons/com.sun.star.resource.OfficeResourceLoader` ), provides access to some types of resources within those files.
    *
    * Clients have to specify the resource file base name in the call to {@link XResourceBundleLoader.loadBundle()} resp. {@link
    * XResourceBundleLoader.loadBundle_Default()} method. The loader will extent this base name so that the resulting name conforms to the OpenOffice.org
    * resource file naming conventions, and look up the respective resource file, for the requested locale, in OpenOffice.org's installation.
    *
    * The lookup process uses the fallback mechanism as described at the {@link XResourceBundle} interface, except that `Locale.getDefault()` is not used.
    *
    * Resource keys, as passed to the {@link XResourceBundle.getDirectElement()} or {@link com.sun.star.container.XNameAccess.getByName()} , have the
    * following format: `<resource_type>:<numeric_identifier>` , where `<resource_type>` specifies the type of the requested resource (see below) and
    * `<numeric_identifier>` is the numeric identifier of the resource.
    *
    * The following resource types are currently supported: **string** : denotes a string resource
    *
    * Since the numeric resource identifiers are highly build-dependent (e.g. can change with any next OpenOffice.org build), you are **strongly**
    * discouraged from using the OfficeResoureLoader service in a component which targets more than one particular OpenOffice.org build.
    * @since OOo 2.0.3
    */
  type OfficeResourceLoader = XResourceBundleLoader
  
  /** specifies a service providing access to a resource string table implementing the {@link com.sun.star.awt.XDialog} interface. */
  type StringResource = XStringResourcePersistence
  
  /** specifies a service providing access to a resource string table implementing the {@link com.sun.star.resource.XStringResourceWithLocation} interface. */
  trait StringResourceWithLocation
    extends StObject
       with XStringResourceWithLocation {
    
    /**
      * is used to initialize the object on its creation.
      * @param URL Specifies the location used to load and store - if the ReadOnly state allows it - the string table data.
      * @param ReadOnly Specifies if the resource should be read only, see `XStringResourceManager::isReadOnly`
      * @param locale Specifies if the locale first to be used as current locale. Internally the `XStringResourceManager::setCurrentLocale` method is called wit
      * @param BaseName Base string for the file names used to store the locale data. The locale data is stored in Java properties files also following the corr
      * @param Comment Comment stored first in each properties file followed by a line feed character. The line feed character is added automatically and hasn't
      * @param Handler a {@link com.sun.star.task.XInteractionHandler} to be passed to ucb. This may be a null interface.
      * @throws com::sun::star::lang::IllegalArgumentException if no string or an empty string is passed as URL
      */
    def create(
      URL: String,
      ReadOnly: Boolean,
      locale: Locale,
      BaseName: String,
      Comment: String,
      Handler: XInteractionHandler
    ): Unit
  }
  object StringResourceWithLocation {
    
    @scala.inline
    def apply(
      CurrentLocale: Locale,
      DefaultLocale: Locale,
      Locales: SafeArray[Locale],
      ResourceIDs: SafeArray[String],
      UniqueNumericId: Double,
      acquire: () => Unit,
      addModifyListener: XModifyListener => Unit,
      create: (String, Boolean, Locale, String, String, XInteractionHandler) => Unit,
      exportBinary: () => SafeArray[Double],
      getCurrentLocale: () => Locale,
      getDefaultLocale: () => Locale,
      getLocales: () => SafeArray[Locale],
      getResourceIDs: () => SafeArray[String],
      getResourceIDsForLocale: Locale => SafeArray[String],
      getUniqueNumericId: () => Double,
      hasEntryForId: String => Boolean,
      hasEntryForIdAndLocale: (String, Locale) => Boolean,
      importBinary: SeqEquiv[Double] => Unit,
      isModified: () => Boolean,
      isReadOnly: () => Boolean,
      newLocale: Locale => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeId: String => Unit,
      removeIdForLocale: (String, Locale) => Unit,
      removeLocale: Locale => Unit,
      removeModifyListener: XModifyListener => Unit,
      resolveString: String => String,
      resolveStringForLocale: (String, Locale) => String,
      setComment: String => Unit,
      setCurrentLocale: (Locale, Boolean) => Unit,
      setDefaultLocale: Locale => Unit,
      setString: (String, String) => Unit,
      setStringForLocale: (String, String, Locale) => Unit,
      setURL: String => Unit,
      store: () => Unit,
      storeAsURL: String => Unit,
      storeToStorage: (XStorage, String, String) => Unit,
      storeToURL: (String, String, String, XInteractionHandler) => Unit
    ): StringResourceWithLocation = {
      val __obj = js.Dynamic.literal(CurrentLocale = CurrentLocale.asInstanceOf[js.Any], DefaultLocale = DefaultLocale.asInstanceOf[js.Any], Locales = Locales.asInstanceOf[js.Any], ResourceIDs = ResourceIDs.asInstanceOf[js.Any], UniqueNumericId = UniqueNumericId.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addModifyListener = js.Any.fromFunction1(addModifyListener), create = js.Any.fromFunction6(create), exportBinary = js.Any.fromFunction0(exportBinary), getCurrentLocale = js.Any.fromFunction0(getCurrentLocale), getDefaultLocale = js.Any.fromFunction0(getDefaultLocale), getLocales = js.Any.fromFunction0(getLocales), getResourceIDs = js.Any.fromFunction0(getResourceIDs), getResourceIDsForLocale = js.Any.fromFunction1(getResourceIDsForLocale), getUniqueNumericId = js.Any.fromFunction0(getUniqueNumericId), hasEntryForId = js.Any.fromFunction1(hasEntryForId), hasEntryForIdAndLocale = js.Any.fromFunction2(hasEntryForIdAndLocale), importBinary = js.Any.fromFunction1(importBinary), isModified = js.Any.fromFunction0(isModified), isReadOnly = js.Any.fromFunction0(isReadOnly), newLocale = js.Any.fromFunction1(newLocale), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeId = js.Any.fromFunction1(removeId), removeIdForLocale = js.Any.fromFunction2(removeIdForLocale), removeLocale = js.Any.fromFunction1(removeLocale), removeModifyListener = js.Any.fromFunction1(removeModifyListener), resolveString = js.Any.fromFunction1(resolveString), resolveStringForLocale = js.Any.fromFunction2(resolveStringForLocale), setComment = js.Any.fromFunction1(setComment), setCurrentLocale = js.Any.fromFunction2(setCurrentLocale), setDefaultLocale = js.Any.fromFunction1(setDefaultLocale), setString = js.Any.fromFunction2(setString), setStringForLocale = js.Any.fromFunction3(setStringForLocale), setURL = js.Any.fromFunction1(setURL), store = js.Any.fromFunction0(store), storeAsURL = js.Any.fromFunction1(storeAsURL), storeToStorage = js.Any.fromFunction3(storeToStorage), storeToURL = js.Any.fromFunction4(storeToURL))
      __obj.asInstanceOf[StringResourceWithLocation]
    }
    
    @scala.inline
    implicit class StringResourceWithLocationMutableBuilder[Self <: StringResourceWithLocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(value: (String, Boolean, Locale, String, String, XInteractionHandler) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction6(value))
    }
  }
  
  /** specifies a service providing access to a resource string table implementing the {@link com.sun.star.resource.XStringResourceWithStorage} interface. */
  trait StringResourceWithStorage
    extends StObject
       with XStringResourceWithStorage {
    
    /**
      * is used to initialize the object on its creation.
      * @param Storage Specifies the storage used to load and store - if the ReadOnly state allows it - the string table data.
      * @param ReadOnly Specifies if the resource should be read only, see `XStringResourceManager::isReadOnly`
      * @param locale Specifies if the locale first to be used as current locale. Internally the `XStringResourceManager::setCurrentLocale` method is called wit
      * @param BaseName Base string for the file names used to store the locale data. The locale data is stored in Java properties files also following the corr
      * @param Comment Comment stored first in each properties file followed by a line feed character. The line feed character is added automatically and hasn't
      * @throws com::sun::star::lang::IllegalArgumentException if a null interface is passed as Storage
      */
    def create(Storage: XStorage, ReadOnly: Boolean, locale: Locale, BaseName: String, Comment: String): Unit
  }
  object StringResourceWithStorage {
    
    @scala.inline
    def apply(
      CurrentLocale: Locale,
      DefaultLocale: Locale,
      Locales: SafeArray[Locale],
      ResourceIDs: SafeArray[String],
      UniqueNumericId: Double,
      acquire: () => Unit,
      addModifyListener: XModifyListener => Unit,
      create: (XStorage, Boolean, Locale, String, String) => Unit,
      exportBinary: () => SafeArray[Double],
      getCurrentLocale: () => Locale,
      getDefaultLocale: () => Locale,
      getLocales: () => SafeArray[Locale],
      getResourceIDs: () => SafeArray[String],
      getResourceIDsForLocale: Locale => SafeArray[String],
      getUniqueNumericId: () => Double,
      hasEntryForId: String => Boolean,
      hasEntryForIdAndLocale: (String, Locale) => Boolean,
      importBinary: SeqEquiv[Double] => Unit,
      isModified: () => Boolean,
      isReadOnly: () => Boolean,
      newLocale: Locale => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeId: String => Unit,
      removeIdForLocale: (String, Locale) => Unit,
      removeLocale: Locale => Unit,
      removeModifyListener: XModifyListener => Unit,
      resolveString: String => String,
      resolveStringForLocale: (String, Locale) => String,
      setComment: String => Unit,
      setCurrentLocale: (Locale, Boolean) => Unit,
      setDefaultLocale: Locale => Unit,
      setStorage: XStorage => Unit,
      setString: (String, String) => Unit,
      setStringForLocale: (String, String, Locale) => Unit,
      store: () => Unit,
      storeAsStorage: XStorage => Unit,
      storeToStorage: (XStorage, String, String) => Unit,
      storeToURL: (String, String, String, XInteractionHandler) => Unit
    ): StringResourceWithStorage = {
      val __obj = js.Dynamic.literal(CurrentLocale = CurrentLocale.asInstanceOf[js.Any], DefaultLocale = DefaultLocale.asInstanceOf[js.Any], Locales = Locales.asInstanceOf[js.Any], ResourceIDs = ResourceIDs.asInstanceOf[js.Any], UniqueNumericId = UniqueNumericId.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addModifyListener = js.Any.fromFunction1(addModifyListener), create = js.Any.fromFunction5(create), exportBinary = js.Any.fromFunction0(exportBinary), getCurrentLocale = js.Any.fromFunction0(getCurrentLocale), getDefaultLocale = js.Any.fromFunction0(getDefaultLocale), getLocales = js.Any.fromFunction0(getLocales), getResourceIDs = js.Any.fromFunction0(getResourceIDs), getResourceIDsForLocale = js.Any.fromFunction1(getResourceIDsForLocale), getUniqueNumericId = js.Any.fromFunction0(getUniqueNumericId), hasEntryForId = js.Any.fromFunction1(hasEntryForId), hasEntryForIdAndLocale = js.Any.fromFunction2(hasEntryForIdAndLocale), importBinary = js.Any.fromFunction1(importBinary), isModified = js.Any.fromFunction0(isModified), isReadOnly = js.Any.fromFunction0(isReadOnly), newLocale = js.Any.fromFunction1(newLocale), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeId = js.Any.fromFunction1(removeId), removeIdForLocale = js.Any.fromFunction2(removeIdForLocale), removeLocale = js.Any.fromFunction1(removeLocale), removeModifyListener = js.Any.fromFunction1(removeModifyListener), resolveString = js.Any.fromFunction1(resolveString), resolveStringForLocale = js.Any.fromFunction2(resolveStringForLocale), setComment = js.Any.fromFunction1(setComment), setCurrentLocale = js.Any.fromFunction2(setCurrentLocale), setDefaultLocale = js.Any.fromFunction1(setDefaultLocale), setStorage = js.Any.fromFunction1(setStorage), setString = js.Any.fromFunction2(setString), setStringForLocale = js.Any.fromFunction3(setStringForLocale), store = js.Any.fromFunction0(store), storeAsStorage = js.Any.fromFunction1(storeAsStorage), storeToStorage = js.Any.fromFunction3(storeToStorage), storeToURL = js.Any.fromFunction4(storeToURL))
      __obj.asInstanceOf[StringResourceWithStorage]
    }
    
    @scala.inline
    implicit class StringResourceWithStorageMutableBuilder[Self <: StringResourceWithStorage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(value: (XStorage, Boolean, Locale, String, String) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction5(value))
    }
  }
  
  /**
    * offers some operations on {@link com.sun.star.lang.Locale} structures.
    * @see XResourceBundle
    * @see Locale
    */
  trait XLocale
    extends StObject
       with XInterface {
    
    /** @returns a sequence of all locales which are available in the system. */
    val AvailableLocales: SafeArray[Locale]
    
    /**
      * the common method of getting the current default locale.
      *
      * It is used for the presentation (for menus, dialogs, etc.). It is, generally, set once when your applet or application is initialized, then never
      * reset. (If you do reset the default locale, you probably want to reload your GUI, so that the change is reflected in your interface.)
      *
      * More advanced programs allow users to use different locales for different fields, for example, in a spreadsheet.
      *
      * ;  Note that the initial setting will match the host system.
      */
    var Default: Locale
    
    /** @returns a sequence of all ISO country codes known to the component. */
    val ISOCountries: SafeArray[String]
    
    /** @returns a sequence of all ISO language codes known to the component. */
    val ISOLanguages: SafeArray[String]
    
    /**
      * creates a locale from language, country, and variant.
      *
      * NOTE: ISO 639 is not a stable standard; some of the language codes it defines (specifically iw, ji, and in) have changed. This constructor accepts
      * both the old codes (iw, ji, and in) and the new codes (he, yi, and id), but all other API on {@link XLocale} will return only the **NEW** codes.
      *
      * Note: The Java class `Locale` returns the **old** codes.
      */
    def create(aLanguage: String, aCountry: String, aVariant: String): Locale
    
    /** @returns `TRUE` if the {@link com.sun.star.lang.Locale}**l1** is equal to the other one.  A locale is deemed equal to another locale with identical langua */
    def equals(l1: Locale, l2: Locale): Boolean
    
    /** @returns a sequence of all locales which are available in the system. */
    def getAvailableLocales(): SafeArray[Locale]
    
    /**
      * the common method of getting the current default locale.
      *
      * It is used for the presentation (for menus, dialogs, etc.). It is, generally, set once when your applet or application is initialized, then never
      * reset. (If you do reset the default locale, you probably want to reload your GUI, so that the change is reflected in your interface.)
      *
      * More advanced programs allow users to use different locales for different fields, for example, in a spreadsheet.
      *
      * ;  Note that the initial setting will match the host system.
      */
    def getDefault(): Locale
    
    /**
      * @param locale the locale.
      * @param inLocale specifies the desired user country.
      * @returns country code for display of field to user. If the localized name is not found, returns the ISO codes.
      */
    def getDisplayCountry(locale: Locale, inLocale: Locale): String
    
    /** @returns country code for display of field to user. If the localized name is not found, returns the ISO code. The desired user country is from the default */
    def getDisplayCountry_Default(locale: Locale): String
    
    /**
      * @param locale the locale.
      * @param inLocale specifies the desired user language.
      * @returns language code for display of field to user. If the localized name is not found, returns the ISO codes.
      */
    def getDisplayLanguage(locale: Locale, inLocale: Locale): String
    
    /** @returns language code for display of field to user. If the localized name is not found, returns the ISO code. The desired user language is from the defau */
    def getDisplayLanguage_Default(locale: Locale): String
    
    /**
      * @param locale the locale.
      * @param inLocale specifies the desired user locale.
      * @returns a string to display the entire locale to user. If the localized name is not found, uses the ISO codes.
      */
    def getDisplayName(locale: Locale, inLocale: Locale): String
    
    /**
      * @param locale the locale.
      * @returns a string to display the entire locale to user. If the localized name is not found, uses the ISO codes. The default locale is used for the present
      */
    def getDisplayName_Default(locale: Locale): String
    
    /**
      * @param locale the locale.
      * @param inLocale specifies the desired user variant.
      * @returns variant code for display of field to user. If the localized name is not found, returns the ISO codes.
      */
    def getDisplayVariant(locale: Locale, inLocale: Locale): String
    
    /** @returns variant code for display of field to user. The desired user variant is from the default locale. */
    def getDisplayVariant_Default(locale: Locale): String
    
    /** @returns the ISO country code for the specified locale. */
    def getISO3Country(locale: Locale): String
    
    /** @returns the ISO language code for the specified locale. */
    def getISO3Language(locale: Locale): String
    
    /** @returns a sequence of all ISO country codes known to the component. */
    def getISOCountries(): SafeArray[String]
    
    /** @returns a sequence of all ISO language codes known to the component. */
    def getISOLanguages(): SafeArray[String]
    
    /** @returns a sequence for language codes which are valid within the given country. */
    def getLanguagesForCountry(country: String): SafeArray[String]
    
    /**
      * sets the default locale for the whole environment.
      *
      * It is normally set once at the beginning of an application, then never reset. `setDefault` does not reset the host locale.
      */
    def setDefault(newLocale: Locale): Unit
  }
  object XLocale {
    
    @scala.inline
    def apply(
      AvailableLocales: SafeArray[Locale],
      Default: Locale,
      ISOCountries: SafeArray[String],
      ISOLanguages: SafeArray[String],
      acquire: () => Unit,
      create: (String, String, String) => Locale,
      equals_ : (Locale, Locale) => Boolean,
      getAvailableLocales: () => SafeArray[Locale],
      getDefault: () => Locale,
      getDisplayCountry: (Locale, Locale) => String,
      getDisplayCountry_Default: Locale => String,
      getDisplayLanguage: (Locale, Locale) => String,
      getDisplayLanguage_Default: Locale => String,
      getDisplayName: (Locale, Locale) => String,
      getDisplayName_Default: Locale => String,
      getDisplayVariant: (Locale, Locale) => String,
      getDisplayVariant_Default: Locale => String,
      getISO3Country: Locale => String,
      getISO3Language: Locale => String,
      getISOCountries: () => SafeArray[String],
      getISOLanguages: () => SafeArray[String],
      getLanguagesForCountry: String => SafeArray[String],
      queryInterface: `type` => js.Any,
      release: () => Unit,
      setDefault: Locale => Unit
    ): XLocale = {
      val __obj = js.Dynamic.literal(AvailableLocales = AvailableLocales.asInstanceOf[js.Any], Default = Default.asInstanceOf[js.Any], ISOCountries = ISOCountries.asInstanceOf[js.Any], ISOLanguages = ISOLanguages.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), create = js.Any.fromFunction3(create), getAvailableLocales = js.Any.fromFunction0(getAvailableLocales), getDefault = js.Any.fromFunction0(getDefault), getDisplayCountry = js.Any.fromFunction2(getDisplayCountry), getDisplayCountry_Default = js.Any.fromFunction1(getDisplayCountry_Default), getDisplayLanguage = js.Any.fromFunction2(getDisplayLanguage), getDisplayLanguage_Default = js.Any.fromFunction1(getDisplayLanguage_Default), getDisplayName = js.Any.fromFunction2(getDisplayName), getDisplayName_Default = js.Any.fromFunction1(getDisplayName_Default), getDisplayVariant = js.Any.fromFunction2(getDisplayVariant), getDisplayVariant_Default = js.Any.fromFunction1(getDisplayVariant_Default), getISO3Country = js.Any.fromFunction1(getISO3Country), getISO3Language = js.Any.fromFunction1(getISO3Language), getISOCountries = js.Any.fromFunction0(getISOCountries), getISOLanguages = js.Any.fromFunction0(getISOLanguages), getLanguagesForCountry = js.Any.fromFunction1(getLanguagesForCountry), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDefault = js.Any.fromFunction1(setDefault))
      __obj.updateDynamic("equals")(js.Any.fromFunction2(equals_))
      __obj.asInstanceOf[XLocale]
    }
    
    @scala.inline
    implicit class XLocaleMutableBuilder[Self <: XLocale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvailableLocales(value: SafeArray[Locale]): Self = StObject.set(x, "AvailableLocales", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreate(value: (String, String, String) => Locale): Self = StObject.set(x, "create", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDefault(value: Locale): Self = StObject.set(x, "Default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEquals_(value: (Locale, Locale) => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetAvailableLocales(value: () => SafeArray[Locale]): Self = StObject.set(x, "getAvailableLocales", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDefault(value: () => Locale): Self = StObject.set(x, "getDefault", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDisplayCountry(value: (Locale, Locale) => String): Self = StObject.set(x, "getDisplayCountry", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetDisplayCountry_Default(value: Locale => String): Self = StObject.set(x, "getDisplayCountry_Default", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetDisplayLanguage(value: (Locale, Locale) => String): Self = StObject.set(x, "getDisplayLanguage", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetDisplayLanguage_Default(value: Locale => String): Self = StObject.set(x, "getDisplayLanguage_Default", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetDisplayName(value: (Locale, Locale) => String): Self = StObject.set(x, "getDisplayName", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetDisplayName_Default(value: Locale => String): Self = StObject.set(x, "getDisplayName_Default", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetDisplayVariant(value: (Locale, Locale) => String): Self = StObject.set(x, "getDisplayVariant", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetDisplayVariant_Default(value: Locale => String): Self = StObject.set(x, "getDisplayVariant_Default", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetISO3Country(value: Locale => String): Self = StObject.set(x, "getISO3Country", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetISO3Language(value: Locale => String): Self = StObject.set(x, "getISO3Language", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetISOCountries(value: () => SafeArray[String]): Self = StObject.set(x, "getISOCountries", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetISOLanguages(value: () => SafeArray[String]): Self = StObject.set(x, "getISOLanguages", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLanguagesForCountry(value: String => SafeArray[String]): Self = StObject.set(x, "getLanguagesForCountry", js.Any.fromFunction1(value))
      
      @scala.inline
      def setISOCountries(value: SafeArray[String]): Self = StObject.set(x, "ISOCountries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setISOLanguages(value: SafeArray[String]): Self = StObject.set(x, "ISOLanguages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetDefault(value: Locale => Unit): Self = StObject.set(x, "setDefault", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Resource bundles contain locale-specific objects.
    *
    * When your program needs a locale-specific resource, such as `String` for example, your program can load it from the resource bundle that is
    * appropriate for the current user's locale. In this way, you can write program code that is largely independent of the user's locale, which isolates
    * most, if not all, of the locale-specific information in resource bundles.
    *
    * This allows you to write programs that can:
    *
    * be easily localized, or translated, into different languages.
    *
    * handle multiple locales at once.
    *
    * be easily modified, later, to support even more locales.
    *
    *
    *
    * One resource bundle is, conceptually, a set of related services that supports `XResourceBundle` . Each related service of `XResourceBundle` has the
    * same base name plus an additional component that identifies its locale. For example, suppose your resource bundle is named `MyResources` . The first
    * service you are likely to implement is the default resource bundle, which has the same name as its family  - `MyResources` . You can also provide as
    * many related locale-specific services as you need.
    *
    * For example, perhaps you would provide a German one named `MyResources_de` .
    *
    * Each related implementation of `XResourceBundle` contains the same items, but the items have been translated for the locale represented by that
    * `XResourceBundle` implementation. For example, both `MyResources` and `MyResources_de` may have a `String` that is used on a button for confirming
    * operations. In `MyResources` the `String` may contain `OK` and in `MyResources_de` it may contain `Gut` .
    *
    * If there are different resources for different countries, you can make specializations: for example, `MyResources_de_CH` is the German language (de)
    * in Switzerland (CH). If you only want to modify some of the resources in the specialization, you can do so.
    *
    * When your program needs a locale-specific object, it loads
    *
    * the `XResourceBundle` implementation using the {@link XResourceBundleLoader} service:
    *
    * {{program example here, see documentation}}
    *
    *
    *
    * The first argument specifies the family name of the resource bundle that contains the object in question. The second argument indicates the desired
    * locale. `getBundle` uses these two arguments to construct the name of the `ResourceBundle` subclass it should load according to the following
    * specifications.
    *
    * The resource bundle lookup searches for services with various suffixes on the basis of (1) the desired locale and (2) the current default locale as
    * returned by Locale.getDefault(), and (3) the root resource bundle (baseclass), in the following order from lower-level (more specific) to parent-level
    * (less specific):
    *
    * baseclass + "_" + language1 + "_" + country1 + "_" + variant1 ;  baseclass + "_" + language1 + "_" + country1 ;  baseclass + "_" + language1 ;
    * baseclass + "_" + language2 + "_" + country2 + "_" + variant2 ;  baseclass + "_" + language2 + "_" + country2 ;  baseclass + "_" + language2 ;
    * baseclass
    *
    * For example, if the current default locale is `en_US` , the locale that the caller is interested in is `fr_CH` , and the resource bundle name is
    * `MyResources` ; resource bundle lookup will search for the following services, in order: ; `MyResources_fr_CH ;  MyResources_fr ;  MyResources_en_US ;
    *  MyResources_en ;  MyResources`
    *
    * The result of the lookup is a service, but that service may be backed by a property file on disk. If a lookup fails, `getBundle()` throws a
    * `MissingResourceException` .
    *
    * The base service **must** be fully qualified (for example, `myPackage::MyResources` , not just `MyResources` ).
    *
    * Resource bundles contain key/value pairs. The keys uniquely identify a locale-specific object in the bundle. Here is an example of a `XResourceBundle`
    * implementation that contains two key/value pairs:
    *
    * {{program example here, see documentation}}
    *
    *
    *
    * Keys are always `String` s. In this example, the keys are `OkKey` and `CancelKey` . In the above example, the values are also `String` s  - `OK` and
    * `Cancel` -  but they do not have to be. The values can be any type of object.
    *
    * You retrieve an object from resource bundle using the appropriate get method. Because `OkKey` and `CancelKey` are both strings, you use `getByName` to
    * retrieve them:
    *
    * {{program example here, see documentation}}
    *
    *
    *
    * The get methods all require the key as an argument and return the object if found. If the object is not found, the get methods throw a {@link
    * com.sun.star.container.NoSuchElementException} .
    *
    * **NOTE:** You should always supply a base service with no suffixes. This will be the class of "last resort" if a locale is requested that does not
    * exist. In fact, you must provide **all** of the services in any given inheritance chain for which you provide a resource. For example, if you provide
    * `MyResources_fr_BE` , you must provide **both**`MyResources`**and**`MyResources_fr` , or the resource bundle lookup will not work right.
    *
    * You do not have to restrict yourself to using a single family of `ResourceBundle` s. For example, you could have a set of bundles for exception
    * messages, `ExceptionResources` ( `ExceptionResources_fr` , `ExceptionResources_de` , ...), and one for widgets, `WidgetResource` (
    * `WidgetResources_fr` , `WidgetResources_de` , ...); breaking up the resources however you like.
    * @author Mark Davis
    * @author Markus Meyer
    * @deprecated Deprecateddraft
    * @see MissingResourceException
    * @see Locale
    * @version 0.1 26 May 1999
    */
  trait XResourceBundle
    extends StObject
       with XNameAccess {
    
    /** @returns the locale for this resource bundle.  This function can be used to determine whether the resource bundle that is returned really corresponds to t */
    val Locale: typings.activexLibreoffice.com_.sun.star.lang.Locale
    
    /**
      * contains the parent bundle of this bundle.
      *
      * The parent bundle is searched by the method {@link com.sun.star.container.XNameAccess.getByName()} when this bundle does not contain a particular
      * resource.
      */
    var Parent: XResourceBundle
    
    /**
      * @param key specifies the element.
      * @returns an object from a resource bundle or NULL if no resource exists.  It does not look in the parents.
      */
    def getDirectElement(key: String): js.Any
    
    /** @returns the locale for this resource bundle.  This function can be used to determine whether the resource bundle that is returned really corresponds to t */
    def getLocale(): typings.activexLibreoffice.com_.sun.star.lang.Locale
  }
  object XResourceBundle {
    
    @scala.inline
    def apply(
      ElementNames: SafeArray[String],
      ElementType: `type`,
      Locale: Locale,
      Parent: XResourceBundle,
      acquire: () => Unit,
      getByName: String => js.Any,
      getDirectElement: String => js.Any,
      getElementNames: () => SafeArray[String],
      getElementType: () => `type`,
      getLocale: () => Locale,
      hasByName: String => Boolean,
      hasElements: () => Boolean,
      queryInterface: `type` => js.Any,
      release: () => Unit
    ): XResourceBundle = {
      val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getByName = js.Any.fromFunction1(getByName), getDirectElement = js.Any.fromFunction1(getDirectElement), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), getLocale = js.Any.fromFunction0(getLocale), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XResourceBundle]
    }
    
    @scala.inline
    implicit class XResourceBundleMutableBuilder[Self <: XResourceBundle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetDirectElement(value: String => js.Any): Self = StObject.set(x, "getDirectElement", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetLocale(value: () => Locale): Self = StObject.set(x, "getLocale", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLocale(value: Locale): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: XResourceBundle): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * makes it possible to load resource bundles.
    *
    * The search algorithm is specified in the documentation of {@link XResourceBundle} . The implementations must follow the name scheme, but it is allowed
    * to search in several locations.
    * @see MissingResourceException
    * @see XResourceBundle
    * @see Locale
    */
  trait XResourceBundleLoader
    extends StObject
       with XInterface {
    
    /** loads the appropriate resource bundle subclass. */
    def loadBundle(abaseName: String, aLocale: Locale): XResourceBundle
    
    /** loads the appropriate resource bundle. */
    def loadBundle_Default(aBaseName: String): XResourceBundle
  }
  object XResourceBundleLoader {
    
    @scala.inline
    def apply(
      acquire: () => Unit,
      loadBundle: (String, Locale) => XResourceBundle,
      loadBundle_Default: String => XResourceBundle,
      queryInterface: `type` => js.Any,
      release: () => Unit
    ): XResourceBundleLoader = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), loadBundle = js.Any.fromFunction2(loadBundle), loadBundle_Default = js.Any.fromFunction1(loadBundle_Default), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XResourceBundleLoader]
    }
    
    @scala.inline
    implicit class XResourceBundleLoaderMutableBuilder[Self <: XResourceBundleLoader] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoadBundle(value: (String, Locale) => XResourceBundle): Self = StObject.set(x, "loadBundle", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoadBundle_Default(value: String => XResourceBundle): Self = StObject.set(x, "loadBundle_Default", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Interface to manage a resource string table containing a set of strings for different locales.
    *
    * The interface is derived from {@link com.sun.star.resource.XStringResourceResolver} that allows to access the string table but not to modify it. This
    * interface also allows to modify the string table.
    *
    * It's designed to be used in the context of creating a string table, e.g. from a string table editor or from a Dialog Editor designing localized
    * dialogs.
    */
  trait XStringResourceManager
    extends StObject
       with XStringResourceResolver {
    
    /**
      * Provides a numeric id that is unique within all Resource IDs used in the string table.
      *
      * This method takes into account all Resource IDs starting with a decimal number and only evaluates the ID until the first non digit character is
      * reached. This allows to extend unique IDs with individual identifiers without breaking the mechanism of this method.
      *
      * Examples: ID "42" -> numeric id 42 ID "0foo" -> numeric id 0 ID "111.MyId.Something.Else" -> numeric id 111 ID "No Digits" -> not considered for
      * numeric id
      *
      * The id returned will be 0 for an empty string table and it will be reset to 0 if all locales are removed. In all other cases this method returns the
      * maximum numeric id used so far at the beginning of a Resource ID incremented by 1. When calling this method more than once always the same number will
      * be returned until this number is really used at the beginning of a new Resource ID passed to {@link setString()} or {@link setStringForLocale()} .
      *
      * As the numeric id is guaranteed to be unique for the complete string table all locales are taken into account. So using this methods will force the
      * implementation to load all locale data that may not have been loaded so far.
      * @throws com::sun::star::lang::NoSupportException if the next available id exceeds the range of type long. So it's not recommended to use own Resource IDs
      */
    val UniqueNumericId: Double
    
    /**
      * Provides a numeric id that is unique within all Resource IDs used in the string table.
      *
      * This method takes into account all Resource IDs starting with a decimal number and only evaluates the ID until the first non digit character is
      * reached. This allows to extend unique IDs with individual identifiers without breaking the mechanism of this method.
      *
      * Examples: ID "42" -> numeric id 42 ID "0foo" -> numeric id 0 ID "111.MyId.Something.Else" -> numeric id 111 ID "No Digits" -> not considered for
      * numeric id
      *
      * The id returned will be 0 for an empty string table and it will be reset to 0 if all locales are removed. In all other cases this method returns the
      * maximum numeric id used so far at the beginning of a Resource ID incremented by 1. When calling this method more than once always the same number will
      * be returned until this number is really used at the beginning of a new Resource ID passed to {@link setString()} or {@link setStringForLocale()} .
      *
      * As the numeric id is guaranteed to be unique for the complete string table all locales are taken into account. So using this methods will force the
      * implementation to load all locale data that may not have been loaded so far.
      * @throws com::sun::star::lang::NoSupportException if the next available id exceeds the range of type long. So it's not recommended to use own Resource IDs
      */
    def getUniqueNumericId(): Double
    
    /**
      * Returns the resource's read only state
      * @returns `TRUE` if the resource is read only, otherwise `FALSE`
      */
    def isReadOnly(): Boolean
    
    /**
      * Creates a new locale.
      *
      * For each existing ResourceID an empty string will be created. The first locale created will automatically be the first default locale. Otherwise
      * strings for all already created IDs will be copied from the default locale.
      * @throws com::sun::star::container::ElementExistException if the Locale already has been created.
      * @throws com::sun::star::lang::IllegalArgumentException if the Locale is not valid.
      * @throws com::sun::star::lang::NoSupportException if the resource is read only, see {@link isReadOnly()}
      */
    def newLocale(locale: Locale): Unit
    
    /**
      * Removes a Resource ID including the corresponding string for the current locale.
      * @param ResourceID The Resource ID to be removed for the current locale.
      * @throws com::sun::star::resource::MissingResourceException if the Resource ID is not valid.
      * @throws com::sun::star::lang::NoSupportException if the resource is read only, see {@link isReadOnly()}
      */
    def removeId(ResourceID: String): Unit
    
    /**
      * Removes a Resource ID including the corresponding string for s specific locale.
      * @param ResourceID The Resource ID to be removed.
      * @param locale The locale the Resource ID should be removed for. The locale has to match exactly with one of the locales provided by {@link getLocales()}
      * @throws com::sun::star::resource::MissingResourceException if the Resource ID is not valid.
      * @throws com::sun::star::lang::NoSupportException if the resource is read only, see {@link isReadOnly()}
      */
    def removeIdForLocale(ResourceID: String, locale: Locale): Unit
    
    /**
      * Removes a locale completely including the corresponding strings for each locale.
      * @throws com::sun::star::lang::IllegalArgumentException if the Locale to be removed is not supported.
      * @throws com::sun::star::lang::NoSupportException if the resource is read only, see {@link isReadOnly()}
      */
    def removeLocale(locale: Locale): Unit
    
    /**
      * Sets the locale to be used
      * @param Locale Specifies the current locale to be used.
      * @param FindClosestMatch  If true: If the exact locale that should be set is not available the method tries to find the closest match. E.g. if en_US is r
      */
    def setCurrentLocale(Locale: Locale, FindClosestMatch: Boolean): Unit
    
    /**
      * Sets the default locale to be used
      * @param Locale Specifies the default locale to be used. If this locale is not available a {@link com.sun.star.lang.IllegalArgumentException} is thrown.
      * @throws com::sun::star::lang::NoSupportException if the resource is read only, see {@link isReadOnly()}
      */
    def setDefaultLocale(Locale: Locale): Unit
    
    /**
      * Associates a String to a Resource ID for the current locale. If an entry for the Resource ID already exists, the string associated with it will be
      * overwritten, otherwise a new entry will be created.
      * @param ResourceID ID to address the string inside the resource for the current locale.
      * @param Str String to be associated with the Resource ID.
      * @throws com::sun::star::lang::NoSupportException if the resource is read only, see {@link isReadOnly()}
      */
    def setString(ResourceID: String, Str: String): Unit
    
    /**
      * Associates a String to a Resource ID for a specific locale. If an entry for the Resource ID already exists, the string associated with it will be
      * overwritten, otherwise a new entry will be created.
      *
      * It's not recommended to use this method to get the best performance as the implementation may be optimized for the use of the current locale.
      * @param ResourceID ID to address the string inside the resource.
      * @param Str String to be associated with the Resource ID.
      * @param locale The locale the string should be set for. The locale has to match exactly with one of the locales provided by {@link getLocales()} . A clos
      * @throws com::sun::star::lang::NoSupportException if the resource is read only, see {@link isReadOnly()}
      */
    def setStringForLocale(ResourceID: String, Str: String, locale: Locale): Unit
  }
  object XStringResourceManager {
    
    @scala.inline
    def apply(
      CurrentLocale: Locale,
      DefaultLocale: Locale,
      Locales: SafeArray[Locale],
      ResourceIDs: SafeArray[String],
      UniqueNumericId: Double,
      acquire: () => Unit,
      addModifyListener: XModifyListener => Unit,
      getCurrentLocale: () => Locale,
      getDefaultLocale: () => Locale,
      getLocales: () => SafeArray[Locale],
      getResourceIDs: () => SafeArray[String],
      getResourceIDsForLocale: Locale => SafeArray[String],
      getUniqueNumericId: () => Double,
      hasEntryForId: String => Boolean,
      hasEntryForIdAndLocale: (String, Locale) => Boolean,
      isReadOnly: () => Boolean,
      newLocale: Locale => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeId: String => Unit,
      removeIdForLocale: (String, Locale) => Unit,
      removeLocale: Locale => Unit,
      removeModifyListener: XModifyListener => Unit,
      resolveString: String => String,
      resolveStringForLocale: (String, Locale) => String,
      setCurrentLocale: (Locale, Boolean) => Unit,
      setDefaultLocale: Locale => Unit,
      setString: (String, String) => Unit,
      setStringForLocale: (String, String, Locale) => Unit
    ): XStringResourceManager = {
      val __obj = js.Dynamic.literal(CurrentLocale = CurrentLocale.asInstanceOf[js.Any], DefaultLocale = DefaultLocale.asInstanceOf[js.Any], Locales = Locales.asInstanceOf[js.Any], ResourceIDs = ResourceIDs.asInstanceOf[js.Any], UniqueNumericId = UniqueNumericId.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addModifyListener = js.Any.fromFunction1(addModifyListener), getCurrentLocale = js.Any.fromFunction0(getCurrentLocale), getDefaultLocale = js.Any.fromFunction0(getDefaultLocale), getLocales = js.Any.fromFunction0(getLocales), getResourceIDs = js.Any.fromFunction0(getResourceIDs), getResourceIDsForLocale = js.Any.fromFunction1(getResourceIDsForLocale), getUniqueNumericId = js.Any.fromFunction0(getUniqueNumericId), hasEntryForId = js.Any.fromFunction1(hasEntryForId), hasEntryForIdAndLocale = js.Any.fromFunction2(hasEntryForIdAndLocale), isReadOnly = js.Any.fromFunction0(isReadOnly), newLocale = js.Any.fromFunction1(newLocale), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeId = js.Any.fromFunction1(removeId), removeIdForLocale = js.Any.fromFunction2(removeIdForLocale), removeLocale = js.Any.fromFunction1(removeLocale), removeModifyListener = js.Any.fromFunction1(removeModifyListener), resolveString = js.Any.fromFunction1(resolveString), resolveStringForLocale = js.Any.fromFunction2(resolveStringForLocale), setCurrentLocale = js.Any.fromFunction2(setCurrentLocale), setDefaultLocale = js.Any.fromFunction1(setDefaultLocale), setString = js.Any.fromFunction2(setString), setStringForLocale = js.Any.fromFunction3(setStringForLocale))
      __obj.asInstanceOf[XStringResourceManager]
    }
    
    @scala.inline
    implicit class XStringResourceManagerMutableBuilder[Self <: XStringResourceManager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetUniqueNumericId(value: () => Double): Self = StObject.set(x, "getUniqueNumericId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsReadOnly(value: () => Boolean): Self = StObject.set(x, "isReadOnly", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNewLocale(value: Locale => Unit): Self = StObject.set(x, "newLocale", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveId(value: String => Unit): Self = StObject.set(x, "removeId", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveIdForLocale(value: (String, Locale) => Unit): Self = StObject.set(x, "removeIdForLocale", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveLocale(value: Locale => Unit): Self = StObject.set(x, "removeLocale", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetCurrentLocale(value: (Locale, Boolean) => Unit): Self = StObject.set(x, "setCurrentLocale", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetDefaultLocale(value: Locale => Unit): Self = StObject.set(x, "setDefaultLocale", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetString(value: (String, String) => Unit): Self = StObject.set(x, "setString", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetStringForLocale(value: (String, String, Locale) => Unit): Self = StObject.set(x, "setStringForLocale", js.Any.fromFunction3(value))
      
      @scala.inline
      def setUniqueNumericId(value: Double): Self = StObject.set(x, "UniqueNumericId", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Interface derived from {@link XStringResourceManager} containing basic persistence functionality limited to operations that are independent from a
    * associated location or storage.
    * @see XStringResourceManager.
    */
  trait XStringResourcePersistence
    extends StObject
       with XStringResourceManager {
    
    /**
      * Returns a sequence of byte representing the complete string resource in a binary format.
      *
      * This method is intended to support datatransfer functionality, e.g. provided by {@link com.sun.star.datatransfer.XTransferable} and related
      * interfaces.
      *
      * See {@link importBinary()} ).
      * @returns a sequence of byte representing the string resource.
      */
    def exportBinary(): SafeArray[Double]
    
    /**
      * Initializes the string resource with binary data. This method expects the data format returned by {@link exportBinary()} .
      *
      * All locales and strings previously added to the string resource will be deleted. So after calling this method the string resource only contains the
      * locales and strings specified in the binary data.
      *
      * This method is intended to support datatransfer functionality, e.g. provided by {@link com.sun.star.datatransfer.XTransferable} and related
      * interfaces.
      *
      * See {@link importBinary()} ).
      * @throws com::sun::star::lang::IllegalArgumentException if Data is empty or does not meet the binary format returned by the current or earlier version of
      */
    def importBinary(Data: SeqEquiv[Double]): Unit
    
    /**
      * provides the current modify state of the StringResourceManager instance.
      * @returns `TRUE` if the string table has changed since the last call to {@link store()} or, if supported `XStringResourceWithStorage::storeAsStorage` . `FA
      */
    def isModified(): Boolean
    
    /**
      * Sets the comment stored first in each locale data file.
      *
      * This interface method can be used to overwrite the comment used during initialization of the services {@link StringResourceWithLocation} or {@link
      * StringResourceWithStorage}
      * @param Comment Comment stored first in each properties file followed by a line feed character. The line feed character is added automatically and hasn't
      */
    def setComment(Comment: String): Unit
    
    /**
      * Stores all string table data respectively all data modified since the last call to {@link store()} to the location or storage associated with the
      * StringResourceManager. Each locale is stored in a single file following the format of Java properties files.
      *
      * This interface is supported by the services {@link StringResourceWithLocation} and {@link StringResourceWithStorage}
      *
      * The {@link StringResourceWithLocation} is initialized with an URL specifying a location used to load data from and store data to, see {@link
      * StringResourceWithLocation} .
      *
      * The {@link StringResourceWithStorage} is initialized with an instance of {@link com.sun.star.embed.XStorage} used to load data from and store data to,
      * see {@link StringResourceWithStorage} .
      *
      * If the string table isn't modified (see {@link isModified()} ) this method does nothing.
      *
      * This method can throw all exceptions thrown by the methods of {@link com.sun.star.embed.XStorage} respectively a {@link
      * com.sun.star.ucb.CommandAbortedException} in case of a {@link StringResourceWithLocation} for all exceptions that are not handled by a previously
      * specified {@link com.sun.star.task.XInteractionHandler} . The handler to be used for the store operation can be specified during initialization of
      * {@link StringResourceWithLocation} .
      * @throws com::sun::star::lang::NoSupportException if no URL or no valid storage are provided.
      */
    def store(): Unit
    
    /**
      * Stores all string table data to the provided storage.
      *
      * Calling this method does not affect the association with a location (in case of a {@link StringResourceWithLocation} instance) respectively with a
      * storage (in case of a {@link StringResourceWithStorage} instance). The modified state isn't affected either.
      *
      * This method can be used to make a copy of the current string table data to a storage. This method can throw all exceptions thrown by the methods of
      * {@link com.sun.star.embed.XStorage}
      * @param Storage all string table data will be stored to this storage.
      * @param BaseName Base string for the file names used to store the locale data. The locale data is stored in Java properties files also following the corr
      * @param Comment Comment stored first in each properties file, for a detailed description see {@link setComment()} . This method can throw all exceptions
      */
    def storeToStorage(Storage: XStorage, BaseName: String, Comment: String): Unit
    
    /**
      * Stores all string table data to the location specified by the passed URL string.
      *
      * Calling this method does not affect the association with a location (in case of a {@link StringResourceWithLocation} instance) respectively with a
      * storage (in case of a {@link StringResourceWithStorage} instance). The modified state isn't affected either.
      *
      * This method can be used to make a copy of the current string table data to a location.
      * @param URL the location the string table data should be stored to.
      * @param BaseName Base string for the file names used to store the locale data. The locale data is stored in Java properties files also following the corr
      * @param Comment Comment stored first in each properties file, for a detailed description see {@link setComment()} .
      * @param Handler a {@link com.sun.star.task.XInteractionHandler} . It will be passed to ucb handle exceptions. Exceptions not processed by this handler wi
      * @see com.sun.star.task.InteractionHandler
      */
    def storeToURL(URL: String, BaseName: String, Comment: String, Handler: XInteractionHandler): Unit
  }
  object XStringResourcePersistence {
    
    @scala.inline
    def apply(
      CurrentLocale: Locale,
      DefaultLocale: Locale,
      Locales: SafeArray[Locale],
      ResourceIDs: SafeArray[String],
      UniqueNumericId: Double,
      acquire: () => Unit,
      addModifyListener: XModifyListener => Unit,
      exportBinary: () => SafeArray[Double],
      getCurrentLocale: () => Locale,
      getDefaultLocale: () => Locale,
      getLocales: () => SafeArray[Locale],
      getResourceIDs: () => SafeArray[String],
      getResourceIDsForLocale: Locale => SafeArray[String],
      getUniqueNumericId: () => Double,
      hasEntryForId: String => Boolean,
      hasEntryForIdAndLocale: (String, Locale) => Boolean,
      importBinary: SeqEquiv[Double] => Unit,
      isModified: () => Boolean,
      isReadOnly: () => Boolean,
      newLocale: Locale => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeId: String => Unit,
      removeIdForLocale: (String, Locale) => Unit,
      removeLocale: Locale => Unit,
      removeModifyListener: XModifyListener => Unit,
      resolveString: String => String,
      resolveStringForLocale: (String, Locale) => String,
      setComment: String => Unit,
      setCurrentLocale: (Locale, Boolean) => Unit,
      setDefaultLocale: Locale => Unit,
      setString: (String, String) => Unit,
      setStringForLocale: (String, String, Locale) => Unit,
      store: () => Unit,
      storeToStorage: (XStorage, String, String) => Unit,
      storeToURL: (String, String, String, XInteractionHandler) => Unit
    ): XStringResourcePersistence = {
      val __obj = js.Dynamic.literal(CurrentLocale = CurrentLocale.asInstanceOf[js.Any], DefaultLocale = DefaultLocale.asInstanceOf[js.Any], Locales = Locales.asInstanceOf[js.Any], ResourceIDs = ResourceIDs.asInstanceOf[js.Any], UniqueNumericId = UniqueNumericId.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addModifyListener = js.Any.fromFunction1(addModifyListener), exportBinary = js.Any.fromFunction0(exportBinary), getCurrentLocale = js.Any.fromFunction0(getCurrentLocale), getDefaultLocale = js.Any.fromFunction0(getDefaultLocale), getLocales = js.Any.fromFunction0(getLocales), getResourceIDs = js.Any.fromFunction0(getResourceIDs), getResourceIDsForLocale = js.Any.fromFunction1(getResourceIDsForLocale), getUniqueNumericId = js.Any.fromFunction0(getUniqueNumericId), hasEntryForId = js.Any.fromFunction1(hasEntryForId), hasEntryForIdAndLocale = js.Any.fromFunction2(hasEntryForIdAndLocale), importBinary = js.Any.fromFunction1(importBinary), isModified = js.Any.fromFunction0(isModified), isReadOnly = js.Any.fromFunction0(isReadOnly), newLocale = js.Any.fromFunction1(newLocale), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeId = js.Any.fromFunction1(removeId), removeIdForLocale = js.Any.fromFunction2(removeIdForLocale), removeLocale = js.Any.fromFunction1(removeLocale), removeModifyListener = js.Any.fromFunction1(removeModifyListener), resolveString = js.Any.fromFunction1(resolveString), resolveStringForLocale = js.Any.fromFunction2(resolveStringForLocale), setComment = js.Any.fromFunction1(setComment), setCurrentLocale = js.Any.fromFunction2(setCurrentLocale), setDefaultLocale = js.Any.fromFunction1(setDefaultLocale), setString = js.Any.fromFunction2(setString), setStringForLocale = js.Any.fromFunction3(setStringForLocale), store = js.Any.fromFunction0(store), storeToStorage = js.Any.fromFunction3(storeToStorage), storeToURL = js.Any.fromFunction4(storeToURL))
      __obj.asInstanceOf[XStringResourcePersistence]
    }
    
    @scala.inline
    implicit class XStringResourcePersistenceMutableBuilder[Self <: XStringResourcePersistence] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExportBinary(value: () => SafeArray[Double]): Self = StObject.set(x, "exportBinary", js.Any.fromFunction0(value))
      
      @scala.inline
      def setImportBinary(value: SeqEquiv[Double] => Unit): Self = StObject.set(x, "importBinary", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsModified(value: () => Boolean): Self = StObject.set(x, "isModified", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetComment(value: String => Unit): Self = StObject.set(x, "setComment", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStore(value: () => Unit): Self = StObject.set(x, "store", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStoreToStorage(value: (XStorage, String, String) => Unit): Self = StObject.set(x, "storeToStorage", js.Any.fromFunction3(value))
      
      @scala.inline
      def setStoreToURL(value: (String, String, String, XInteractionHandler) => Unit): Self = StObject.set(x, "storeToURL", js.Any.fromFunction4(value))
    }
  }
  
  /**
    * Interface to access strings in a resource.
    *
    * The interface is derived from {@link com.sun.star.util.XModifyBroadcaster}
    *
    * All registered {@link com.sun.star.util.XModifyListener} interfaces will be notified if either the current locale changes or if a string is added,
    * changed or removed. This usually will only happen if the implementing object also supports the interface {@link
    * com.sun.star.resource.XStringResourceManager} and is used in the design mode of a Dialog or String table editor. But also changing the locale at
    * runtime can be supported in this way.
    */
  trait XStringResourceResolver
    extends StObject
       with XModifyBroadcaster {
    
    /**
      * Returns the current locale specified in the accessed resource.
      *
      * If no locale is available, the returned Locale structure only contains empty strings.
      * @returns the used locale
      */
    val CurrentLocale: Locale
    
    /**
      * Returns the default locale of the accessed resource. In many cases this will be the locale of the Office initially used to create the resource.
      * @returns the used locale
      */
    val DefaultLocale: Locale
    
    /**
      * Returns a sequence of all supported locales
      * @returns a sequence of all supported locales
      */
    val Locales: SafeArray[Locale]
    
    /**
      * Returns a sequence of all valid Resource IDs for the current locale
      * @returns a sequence of all valid Resource IDs
      */
    val ResourceIDs: SafeArray[String]
    
    /**
      * Returns the current locale specified in the accessed resource.
      *
      * If no locale is available, the returned Locale structure only contains empty strings.
      * @returns the used locale
      */
    def getCurrentLocale(): Locale
    
    /**
      * Returns the default locale of the accessed resource. In many cases this will be the locale of the Office initially used to create the resource.
      * @returns the used locale
      */
    def getDefaultLocale(): Locale
    
    /**
      * Returns a sequence of all supported locales
      * @returns a sequence of all supported locales
      */
    def getLocales(): SafeArray[Locale]
    
    /**
      * Returns a sequence of all valid Resource IDs for the current locale
      * @returns a sequence of all valid Resource IDs
      */
    def getResourceIDs(): SafeArray[String]
    
    /**
      * Returns a sequence of all valid Resource IDs for a specific locale
      *
      * It's not recommended to use this method to get the best performance as the implementation may be optimized for the use of the current locale.
      * @param locale The locale the ResourceIDs should be returned for. The locale has to match exactly with one of the locales provided by {@link getLocales()
      * @returns a sequence of all valid Resource IDs
      */
    def getResourceIDsForLocale(locale: Locale): SafeArray[String]
    
    /**
      * Checks if the resource contains an entry for the given ResourceID and current locale.
      * @param ResourceID ID to specify the string inside the resource.
      * @returns `TRUE` if an entry exists, otherwise `FALSE`
      */
    def hasEntryForId(ResourceID: String): Boolean
    
    /**
      * Checks if the resource contains an entry for the given ResourceID and locale.
      *
      * It's not recommended to use this method to get the best performance as the implementation may be optimized for the use of the current locale.
      * @param ResourceID ID to specify the string inside the resource.
      * @param locale The locale the entry should be checked for. The locale has to match exactly with one of the locales provided by {@link getLocales()} . A c
      * @returns `TRUE` if an entry exists, otherwise `FALSE`
      */
    def hasEntryForIdAndLocale(ResourceID: String, locale: Locale): Boolean
    
    /**
      * Resolves the passed ResoureID for the current locale. This locale is set during initialization of the object implementing this interface or - in case
      * that also the interface {@link com.sun.star.resource.XStringResourceManager} is supported - by using the `XStringResourceManager::setLocale` method.
      * @param ResourceID ID to specify the string inside the resource. The ID can - but not needs to - be a hierarchical name like "foo.nothing.invalid".
      * @returns the localized string for the specified ID
      * @throws com::sun::star::resource::MissingResourceException if no entry exists for the given ResourceID
      */
    def resolveString(ResourceID: String): String
    
    /**
      * Resolves the passed ResoureID for a specific locale.
      *
      * It's not recommended to use this method to get the best performance as the implementation may be optimized for the use of the current locale.
      * @param ResourceID ID to specify the string inside the resource. The ID can - but not needs to - be a hierarchical name like "foo.nothing.invalid".
      * @param locale The locale the string should be resolved for. The locale has to match exactly with one of the locales provided by {@link getLocales()} . A
      * @returns the localized string for the specified ID and Locale
      * @throws com::sun::star::resource::MissingResourceException if no entry exists for the given ResourceID or locale
      */
    def resolveStringForLocale(ResourceID: String, locale: Locale): String
  }
  object XStringResourceResolver {
    
    @scala.inline
    def apply(
      CurrentLocale: Locale,
      DefaultLocale: Locale,
      Locales: SafeArray[Locale],
      ResourceIDs: SafeArray[String],
      acquire: () => Unit,
      addModifyListener: XModifyListener => Unit,
      getCurrentLocale: () => Locale,
      getDefaultLocale: () => Locale,
      getLocales: () => SafeArray[Locale],
      getResourceIDs: () => SafeArray[String],
      getResourceIDsForLocale: Locale => SafeArray[String],
      hasEntryForId: String => Boolean,
      hasEntryForIdAndLocale: (String, Locale) => Boolean,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeModifyListener: XModifyListener => Unit,
      resolveString: String => String,
      resolveStringForLocale: (String, Locale) => String
    ): XStringResourceResolver = {
      val __obj = js.Dynamic.literal(CurrentLocale = CurrentLocale.asInstanceOf[js.Any], DefaultLocale = DefaultLocale.asInstanceOf[js.Any], Locales = Locales.asInstanceOf[js.Any], ResourceIDs = ResourceIDs.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addModifyListener = js.Any.fromFunction1(addModifyListener), getCurrentLocale = js.Any.fromFunction0(getCurrentLocale), getDefaultLocale = js.Any.fromFunction0(getDefaultLocale), getLocales = js.Any.fromFunction0(getLocales), getResourceIDs = js.Any.fromFunction0(getResourceIDs), getResourceIDsForLocale = js.Any.fromFunction1(getResourceIDsForLocale), hasEntryForId = js.Any.fromFunction1(hasEntryForId), hasEntryForIdAndLocale = js.Any.fromFunction2(hasEntryForIdAndLocale), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeModifyListener = js.Any.fromFunction1(removeModifyListener), resolveString = js.Any.fromFunction1(resolveString), resolveStringForLocale = js.Any.fromFunction2(resolveStringForLocale))
      __obj.asInstanceOf[XStringResourceResolver]
    }
    
    @scala.inline
    implicit class XStringResourceResolverMutableBuilder[Self <: XStringResourceResolver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentLocale(value: Locale): Self = StObject.set(x, "CurrentLocale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultLocale(value: Locale): Self = StObject.set(x, "DefaultLocale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetCurrentLocale(value: () => Locale): Self = StObject.set(x, "getCurrentLocale", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDefaultLocale(value: () => Locale): Self = StObject.set(x, "getDefaultLocale", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLocales(value: () => SafeArray[Locale]): Self = StObject.set(x, "getLocales", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetResourceIDs(value: () => SafeArray[String]): Self = StObject.set(x, "getResourceIDs", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetResourceIDsForLocale(value: Locale => SafeArray[String]): Self = StObject.set(x, "getResourceIDsForLocale", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasEntryForId(value: String => Boolean): Self = StObject.set(x, "hasEntryForId", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasEntryForIdAndLocale(value: (String, Locale) => Boolean): Self = StObject.set(x, "hasEntryForIdAndLocale", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLocales(value: SafeArray[Locale]): Self = StObject.set(x, "Locales", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveString(value: String => String): Self = StObject.set(x, "resolveString", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResolveStringForLocale(value: (String, Locale) => String): Self = StObject.set(x, "resolveStringForLocale", js.Any.fromFunction2(value))
      
      @scala.inline
      def setResourceIDs(value: SafeArray[String]): Self = StObject.set(x, "ResourceIDs", value.asInstanceOf[js.Any])
    }
  }
  
  /** Provides access to a string resource represented by a {@link com.sun.star.resource.XStringResourceResolver} . */
  trait XStringResourceSupplier
    extends StObject
       with XInterface {
    
    /**
      * Provides access to a string resource. Depending on the context the returned object may also support {@link
      * com.sun.star.resource.XStringResourceManager} or {@link com.sun.star.resource.XStringResourcePersistence} or {@link
      * com.sun.star.resource.XStringResourceWithStorage}
      * @returns an interface {@link com.sun.star.resource.XStringResourceResolver}
      */
    val StringResource: XStringResourceResolver
    
    /**
      * Provides access to a string resource. Depending on the context the returned object may also support {@link
      * com.sun.star.resource.XStringResourceManager} or {@link com.sun.star.resource.XStringResourcePersistence} or {@link
      * com.sun.star.resource.XStringResourceWithStorage}
      * @returns an interface {@link com.sun.star.resource.XStringResourceResolver}
      */
    def getStringResource(): XStringResourceResolver
  }
  object XStringResourceSupplier {
    
    @scala.inline
    def apply(
      StringResource: XStringResourceResolver,
      acquire: () => Unit,
      getStringResource: () => XStringResourceResolver,
      queryInterface: `type` => js.Any,
      release: () => Unit
    ): XStringResourceSupplier = {
      val __obj = js.Dynamic.literal(StringResource = StringResource.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getStringResource = js.Any.fromFunction0(getStringResource), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XStringResourceSupplier]
    }
    
    @scala.inline
    implicit class XStringResourceSupplierMutableBuilder[Self <: XStringResourceSupplier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetStringResource(value: () => XStringResourceResolver): Self = StObject.set(x, "getStringResource", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStringResource(value: XStringResourceResolver): Self = StObject.set(x, "StringResource", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Extends {@link XStringResourcePersistence} by methods to handle an associated location.
    * @see XStringResourcePersistence.
    */
  trait XStringResourceWithLocation
    extends StObject
       with XStringResourcePersistence {
    
    /**
      * Associates a location to the {@link StringResourceWithStorage} instance which is used on subsequent calls of {@link store()} .
      * @param URL the location to be associated to the StringResourceManager  This call has to be used carefully as it removes the location previously connecte
      * @throws com::sun::star::lang::IllegalArgumentException if an empty string is passed as URL
      * @throws com::sun::star::lang::NoSupportException if the location is readonly
      */
    def setURL(URL: String): Unit
    
    /**
      * Stores all string table data to a location and associates this location to this instance as if setLocation() was called with this location. The
      * modified state will be unmodified after the call.
      * @param URL the location the string table data should be stored to.
      */
    def storeAsURL(URL: String): Unit
  }
  object XStringResourceWithLocation {
    
    @scala.inline
    def apply(
      CurrentLocale: Locale,
      DefaultLocale: Locale,
      Locales: SafeArray[Locale],
      ResourceIDs: SafeArray[String],
      UniqueNumericId: Double,
      acquire: () => Unit,
      addModifyListener: XModifyListener => Unit,
      exportBinary: () => SafeArray[Double],
      getCurrentLocale: () => Locale,
      getDefaultLocale: () => Locale,
      getLocales: () => SafeArray[Locale],
      getResourceIDs: () => SafeArray[String],
      getResourceIDsForLocale: Locale => SafeArray[String],
      getUniqueNumericId: () => Double,
      hasEntryForId: String => Boolean,
      hasEntryForIdAndLocale: (String, Locale) => Boolean,
      importBinary: SeqEquiv[Double] => Unit,
      isModified: () => Boolean,
      isReadOnly: () => Boolean,
      newLocale: Locale => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeId: String => Unit,
      removeIdForLocale: (String, Locale) => Unit,
      removeLocale: Locale => Unit,
      removeModifyListener: XModifyListener => Unit,
      resolveString: String => String,
      resolveStringForLocale: (String, Locale) => String,
      setComment: String => Unit,
      setCurrentLocale: (Locale, Boolean) => Unit,
      setDefaultLocale: Locale => Unit,
      setString: (String, String) => Unit,
      setStringForLocale: (String, String, Locale) => Unit,
      setURL: String => Unit,
      store: () => Unit,
      storeAsURL: String => Unit,
      storeToStorage: (XStorage, String, String) => Unit,
      storeToURL: (String, String, String, XInteractionHandler) => Unit
    ): XStringResourceWithLocation = {
      val __obj = js.Dynamic.literal(CurrentLocale = CurrentLocale.asInstanceOf[js.Any], DefaultLocale = DefaultLocale.asInstanceOf[js.Any], Locales = Locales.asInstanceOf[js.Any], ResourceIDs = ResourceIDs.asInstanceOf[js.Any], UniqueNumericId = UniqueNumericId.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addModifyListener = js.Any.fromFunction1(addModifyListener), exportBinary = js.Any.fromFunction0(exportBinary), getCurrentLocale = js.Any.fromFunction0(getCurrentLocale), getDefaultLocale = js.Any.fromFunction0(getDefaultLocale), getLocales = js.Any.fromFunction0(getLocales), getResourceIDs = js.Any.fromFunction0(getResourceIDs), getResourceIDsForLocale = js.Any.fromFunction1(getResourceIDsForLocale), getUniqueNumericId = js.Any.fromFunction0(getUniqueNumericId), hasEntryForId = js.Any.fromFunction1(hasEntryForId), hasEntryForIdAndLocale = js.Any.fromFunction2(hasEntryForIdAndLocale), importBinary = js.Any.fromFunction1(importBinary), isModified = js.Any.fromFunction0(isModified), isReadOnly = js.Any.fromFunction0(isReadOnly), newLocale = js.Any.fromFunction1(newLocale), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeId = js.Any.fromFunction1(removeId), removeIdForLocale = js.Any.fromFunction2(removeIdForLocale), removeLocale = js.Any.fromFunction1(removeLocale), removeModifyListener = js.Any.fromFunction1(removeModifyListener), resolveString = js.Any.fromFunction1(resolveString), resolveStringForLocale = js.Any.fromFunction2(resolveStringForLocale), setComment = js.Any.fromFunction1(setComment), setCurrentLocale = js.Any.fromFunction2(setCurrentLocale), setDefaultLocale = js.Any.fromFunction1(setDefaultLocale), setString = js.Any.fromFunction2(setString), setStringForLocale = js.Any.fromFunction3(setStringForLocale), setURL = js.Any.fromFunction1(setURL), store = js.Any.fromFunction0(store), storeAsURL = js.Any.fromFunction1(storeAsURL), storeToStorage = js.Any.fromFunction3(storeToStorage), storeToURL = js.Any.fromFunction4(storeToURL))
      __obj.asInstanceOf[XStringResourceWithLocation]
    }
    
    @scala.inline
    implicit class XStringResourceWithLocationMutableBuilder[Self <: XStringResourceWithLocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSetURL(value: String => Unit): Self = StObject.set(x, "setURL", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStoreAsURL(value: String => Unit): Self = StObject.set(x, "storeAsURL", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Extends {@link XStringResourcePersistence} by methods to handle an associated {@link com.sun.star.embed.XStorage} instance.
    * @see XStringResourcePersistence.
    */
  trait XStringResourceWithStorage
    extends StObject
       with XStringResourcePersistence {
    
    /**
      * Associates a storage to the {@link StringResourceWithStorage} instance which is used on subsequent calls of {@link store()} .
      * @param Storage the storage to be associated to the StringResourceManager  This call has to be used carefully as it removes the storage previously connec
      * @throws com::sun::star::lang::IllegalArgumentException if a null interface is passed as Storage
      */
    def setStorage(Storage: XStorage): Unit
    
    /**
      * Stores all string table data to a storage and associates this storage to this instance as if {@link setStorage()} was called with this storage. The
      * modified state will be unmodified after the call.
      *
      * This method can throw all exceptions thrown by the methods of {@link com.sun.star.embed.XStorage}
      */
    def storeAsStorage(Storage: XStorage): Unit
  }
  object XStringResourceWithStorage {
    
    @scala.inline
    def apply(
      CurrentLocale: Locale,
      DefaultLocale: Locale,
      Locales: SafeArray[Locale],
      ResourceIDs: SafeArray[String],
      UniqueNumericId: Double,
      acquire: () => Unit,
      addModifyListener: XModifyListener => Unit,
      exportBinary: () => SafeArray[Double],
      getCurrentLocale: () => Locale,
      getDefaultLocale: () => Locale,
      getLocales: () => SafeArray[Locale],
      getResourceIDs: () => SafeArray[String],
      getResourceIDsForLocale: Locale => SafeArray[String],
      getUniqueNumericId: () => Double,
      hasEntryForId: String => Boolean,
      hasEntryForIdAndLocale: (String, Locale) => Boolean,
      importBinary: SeqEquiv[Double] => Unit,
      isModified: () => Boolean,
      isReadOnly: () => Boolean,
      newLocale: Locale => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeId: String => Unit,
      removeIdForLocale: (String, Locale) => Unit,
      removeLocale: Locale => Unit,
      removeModifyListener: XModifyListener => Unit,
      resolveString: String => String,
      resolveStringForLocale: (String, Locale) => String,
      setComment: String => Unit,
      setCurrentLocale: (Locale, Boolean) => Unit,
      setDefaultLocale: Locale => Unit,
      setStorage: XStorage => Unit,
      setString: (String, String) => Unit,
      setStringForLocale: (String, String, Locale) => Unit,
      store: () => Unit,
      storeAsStorage: XStorage => Unit,
      storeToStorage: (XStorage, String, String) => Unit,
      storeToURL: (String, String, String, XInteractionHandler) => Unit
    ): XStringResourceWithStorage = {
      val __obj = js.Dynamic.literal(CurrentLocale = CurrentLocale.asInstanceOf[js.Any], DefaultLocale = DefaultLocale.asInstanceOf[js.Any], Locales = Locales.asInstanceOf[js.Any], ResourceIDs = ResourceIDs.asInstanceOf[js.Any], UniqueNumericId = UniqueNumericId.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addModifyListener = js.Any.fromFunction1(addModifyListener), exportBinary = js.Any.fromFunction0(exportBinary), getCurrentLocale = js.Any.fromFunction0(getCurrentLocale), getDefaultLocale = js.Any.fromFunction0(getDefaultLocale), getLocales = js.Any.fromFunction0(getLocales), getResourceIDs = js.Any.fromFunction0(getResourceIDs), getResourceIDsForLocale = js.Any.fromFunction1(getResourceIDsForLocale), getUniqueNumericId = js.Any.fromFunction0(getUniqueNumericId), hasEntryForId = js.Any.fromFunction1(hasEntryForId), hasEntryForIdAndLocale = js.Any.fromFunction2(hasEntryForIdAndLocale), importBinary = js.Any.fromFunction1(importBinary), isModified = js.Any.fromFunction0(isModified), isReadOnly = js.Any.fromFunction0(isReadOnly), newLocale = js.Any.fromFunction1(newLocale), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeId = js.Any.fromFunction1(removeId), removeIdForLocale = js.Any.fromFunction2(removeIdForLocale), removeLocale = js.Any.fromFunction1(removeLocale), removeModifyListener = js.Any.fromFunction1(removeModifyListener), resolveString = js.Any.fromFunction1(resolveString), resolveStringForLocale = js.Any.fromFunction2(resolveStringForLocale), setComment = js.Any.fromFunction1(setComment), setCurrentLocale = js.Any.fromFunction2(setCurrentLocale), setDefaultLocale = js.Any.fromFunction1(setDefaultLocale), setStorage = js.Any.fromFunction1(setStorage), setString = js.Any.fromFunction2(setString), setStringForLocale = js.Any.fromFunction3(setStringForLocale), store = js.Any.fromFunction0(store), storeAsStorage = js.Any.fromFunction1(storeAsStorage), storeToStorage = js.Any.fromFunction3(storeToStorage), storeToURL = js.Any.fromFunction4(storeToURL))
      __obj.asInstanceOf[XStringResourceWithStorage]
    }
    
    @scala.inline
    implicit class XStringResourceWithStorageMutableBuilder[Self <: XStringResourceWithStorage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSetStorage(value: XStorage => Unit): Self = StObject.set(x, "setStorage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStoreAsStorage(value: XStorage => Unit): Self = StObject.set(x, "storeAsStorage", js.Any.fromFunction1(value))
    }
  }
}
