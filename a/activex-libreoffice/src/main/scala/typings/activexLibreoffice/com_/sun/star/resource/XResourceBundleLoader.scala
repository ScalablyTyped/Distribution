package typings.activexLibreoffice.com_.sun.star.resource

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to load resource bundles.
  *
  * The search algorithm is specified in the documentation of {@link XResourceBundle} . The implementations must follow the name scheme, but it is allowed
  * to search in several locations.
  * @see MissingResourceException
  * @see XResourceBundle
  * @see Locale
  */
trait XResourceBundleLoader extends XInterface {
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
}

