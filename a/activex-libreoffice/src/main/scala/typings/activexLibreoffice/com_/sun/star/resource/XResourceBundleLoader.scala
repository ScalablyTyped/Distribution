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
@js.native
trait XResourceBundleLoader extends XInterface {
  /** loads the appropriate resource bundle subclass. */
  def loadBundle(abaseName: String, aLocale: Locale): XResourceBundle = js.native
  /** loads the appropriate resource bundle. */
  def loadBundle_Default(aBaseName: String): XResourceBundle = js.native
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
  implicit class XResourceBundleLoaderOps[Self <: XResourceBundleLoader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLoadBundle(value: (String, Locale) => XResourceBundle): Self = this.set("loadBundle", js.Any.fromFunction2(value))
    @scala.inline
    def setLoadBundle_Default(value: String => XResourceBundle): Self = this.set("loadBundle_Default", js.Any.fromFunction1(value))
  }
  
}

